package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class Test_13705_13705005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowDuplicateEmail() throws InterruptedException {
        // Step 2: Navigate to the account creation page (Assuming it's already on the sign-up page)
        
        Thread.sleep(500); // Wait for UI to load

        // Step 3: Enter a valid name in the 'Your name' field
        onView(withId(R.id.your_name_field)).perform(typeText("John Doe"));
        Thread.sleep(500);

        // Step 4: Enter an existing email in the 'Your email' field
        onView(withId(R.id.your_email_field)).perform(typeText("existing@example.com"));
        Thread.sleep(500);

        // Step 5: Enter a valid password in the 'Password' field
        onView(withId(R.id.password_field)).perform(typeText("password123"));
        Thread.sleep(500);

        // Step 6: Click on the 'CREATE A FREE ACCOUNT' button
        onView(withId(R.id.id_welcome_page_sign_bton)).perform(click());
        Thread.sleep(500);

        // Expected Result: An error message should appear indicating that the email is already in use.
        onView(withText("Email already in use")).inRoot(isToast()).check(matches(isDisplayed()));
    }
}
```

Note:
- Replace `R.id.your_name_field`, `R.id.your_email_field`, and `R.id.password_field` with actual resource IDs from your app.
- The `isToast()` method is a custom matcher that checks for toast messages. If you are using Espresso 3 or later, you can use `onView(withText("Email already in use")).check(matches(isDisplayed()))` directly without the root check.

Make sure to adjust the package name and resource IDs according to your actual application structure.