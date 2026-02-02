package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;

@RunWith(AndroidJUnit4.class)
public class Test_13705_13705001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSuccessfulAccountCreation() throws InterruptedException {
        // Step 2: Navigate to the account creation page (Assuming it's the next screen after clicking the button)
        Thread.sleep(500);
        
        // Step 3: Enter a valid name in the 'Your name' field
        onView(withId(R.id.your_name_field)).perform(typeText("John Doe"));
        Thread.sleep(500);

        // Step 4: Enter a valid email in the 'Your email' field
        onView(withId(R.id.your_email_field)).perform(typeText("johndoe@example.com"));
        Thread.sleep(500);

        // Step 5: Enter a valid password in the 'Password' field
        onView(withId(R.id.password_field)).perform(typeText("StrongP@ssw0rd"));
        Thread.sleep(500);

        // Step 6: Click on the 'CREATE A FREE ACCOUNT' button
        onView(withId(R.id.create_account_button)).perform(click());
        Thread.sleep(500);

        // Expected Result: Confirmation message should appear indicating successful account creation
        onView(withText(containsString("Account created successfully"))).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Expected Result: User should be redirected to the login page (Assuming it's a different activity)
        onView(withId(R.id.login_page_button)).check(matches(isDisplayed()));
    }
}
```

Note:
- Replace `R.id.your_name_field`, `R.id.your_email_field`, and `R.id.password_field` with actual resource IDs from your app.
- Ensure that the button ID is correctly set to `R.id.create_account_button`.
- The `Thread.sleep(500)` calls are used for demonstration purposes. In a real test, consider using Espresso's built-in waiting mechanisms or other synchronization techniques instead of `Thread.sleep()`.