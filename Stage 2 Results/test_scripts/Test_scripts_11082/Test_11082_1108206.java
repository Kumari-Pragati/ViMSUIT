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
public class Test_11082_1108206 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testConnectWithEmailNegativeFlow() throws InterruptedException {
        // Step 1: Open the Ticketpop app (Assuming it's already open, or this step is handled by setup)

        // Step 2: Click on the 'Connect with Email' button
        onView(withId(R.id.id_btn_login)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Cancel the email login process (Assuming there's a cancel button or back navigation)
        // For this example, we'll simulate cancellation by navigating back
        Thread.sleep(500);
        onView(withText("Cancel")).perform(click());
        Thread.sleep(500);

        // Expected Result: The user should be redirected back to the login page
        onView(withId(R.id.id_btn_login)).check(matches(withText("Sign In")));
    }
}
```

Note: This code assumes that there is a "Cancel" button or some other way to cancel the email login process. If not, you may need to handle this differently based on your application's UI and navigation flow.