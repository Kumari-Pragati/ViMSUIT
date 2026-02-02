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
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10594_1059405 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheCalltoactionCtaButtonLabeledGetStartedIsClickable() throws InterruptedException {
        // Wait for the UI to load and stabilize
        Thread.sleep(500);

        // Step 1: Click on the 'GET STARTED' button
        onView(withId(R.id.id_fragment_phone_insertion__welcomeContinueButton)).perform(click());

        // Step 2 & 3: Verify that clicking the 'GET STARTED' button navigates to the next screen
        Thread.sleep(500);
        onView(withId(R.id.next_screen_id)).check(matches(isClickable()));
    }
}
```

Note:
- Ensure `MainActivity` is the entry point of your application.
- Replace `next_screen_id` with the actual resource ID of the next screen's element you want to verify.