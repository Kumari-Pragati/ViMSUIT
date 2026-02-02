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
public class Test_11088_1108801 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyToggleSwitchFunctionality() throws InterruptedException {
        // Step 1: Open the app and navigate to the Notifications settings page.
        // Assuming that navigating to the settings page is handled by the MainActivity

        // Step 2: Locate the toggle switch labeled 'Send me discounts and other tasty updates'.
        onView(withId(R.id.id_enable_notifications)).check(matches(isDisplayed()));

        // Step 3: Click on the toggle switch to disable notifications
        Thread.sleep(500);
        onView(withId(R.id.id_enable_notifications)).perform(click());

        // Step 4: Click on the toggle switch again to re-enable notifications
        Thread.sleep(500);
        onView(withId(R.id.id_enable_notifications)).perform(click());
    }
}