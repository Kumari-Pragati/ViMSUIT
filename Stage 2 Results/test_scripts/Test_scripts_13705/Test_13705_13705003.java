package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_13705_13705003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidEmailFormat() throws InterruptedException {
        // Step 2: Navigate to the account creation page (Assuming it's already there)
        
        // Step 3: Enter an invalid email format in the 'Your email' field
        onView(withId(R.id.your_email_field_id)).perform(typeText("invalidemail"), clearText(), typeText("invalid@emai"));
        Thread.sleep(500);

        // Step 4: Enter a valid name in the 'Your name' field
        onView(withId(R.id.your_name_field_id)).perform(typeText("John Doe"));
        Thread.sleep(500);

        // Step 5: Enter a valid password in the 'Password' field
        onView(withId(R.id.password_field_id)).perform(typeText("password123"));
        Thread.sleep(500);

        // Step 6: Click on the 'CREATE A FREE ACCOUNT' button
        onView(withId(R.id.id_welcome_page_sign_bton)).perform(click());
        Thread.sleep(500);

        // Expected Result: An error message should appear indicating that the email format is invalid
        onView(withText("Invalid email format")).inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.FrameLayout.class)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
```

Note:
- Replace `R.id.your_email_field_id`, `R.id.your_name_field_id`, and `R.id.password_field_id` with the actual resource IDs of your UI elements.
- Ensure that you have the necessary dependencies in your `build.gradle` file for Espresso testing.