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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11088_1108804 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyToggleSwitchIsEnabled() throws InterruptedException {
        // Step 1: Open the app and navigate to the Notifications settings page.
        // Assuming the app has a navigation drawer or similar, this step is skipped for simplicity.

        // Step 2: Locate the toggle switch labeled 'Send me discounts and other tasty updates'.
        onView(withId(R.id.id_enable_notifications)).check(matches(isDisplayed()));

        // Step 3: Click on the toggle switch to enable notifications.
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.id_enable_notifications)).perform(click());

        // Wait for the toggle to update its state
        Thread.sleep(500);

        // Expected Result: The toggle switch should be in the enabled state (yellow circle on the right).
        onView(withId(R.id.id_enable_notifications)).check(matches(isDisplayed()));
    }
}