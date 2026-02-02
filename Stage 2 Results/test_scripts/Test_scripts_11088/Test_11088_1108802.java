package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;

@RunWith(AndroidJUnit4.class)
public class Test_11088_1108802 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyToggleSwitchIsEnabledByDefault() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 1: Open the app and navigate to the Notifications settings page.
        // Assuming that navigating to the notifications settings page involves some action like clicking a menu item or swiping

        // Step 2: Locate the toggle switch labeled 'Send me discounts and other tasty updates'
        onView(withId(R.id.id_enable_notifications)).check(matches(isDisplayed()));

        // Thread.sleep(500) to ensure the UI is fully updated after the previous interaction
        Thread.sleep(500);

        // Step 3: Verify that the toggle switch is in the enabled state (yellow circle on the right)
        onView(withId(R.id.id_enable_notifications)).check(matches(isEnabled()));
    }
}