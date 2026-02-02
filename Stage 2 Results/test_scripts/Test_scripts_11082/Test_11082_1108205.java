package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11082_1108205 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithFacebookNegativeFlow throws InterruptedException {
        // Step 1: Open the Ticketpop app (Assuming it's already open, or this step is handled by setup)

        // Step 2: Click on the 'Login with Facebook' button
        onView(withId(R.id.id_btn_login)).perform(click());
        
        Thread.sleep(500); // Wait for a moment to ensure the action has time to complete

        // Step 3: Cancel the Facebook login process (Assuming there's a cancel button or similar)
        // For this example, we'll simulate cancellation by clicking outside the dialog
        onView(withId(R.id.id_btn_login)).perform(click());
        
        Thread.sleep(500); // Wait for a moment to ensure the action has time to complete

        // Expected Result: The user should be redirected back to the login page
        onView(withText("Sign In")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}
```

Note:
- `isDialog()` is used to match views inside a dialog.
- Adjust the sleep times as necessary based on your app's performance and test environment.