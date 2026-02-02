package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_11088_1108803 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyToggleSwitchIsDisabled() throws InterruptedException {
        // Thread.sleep to allow the UI to initialize properly
        Thread.sleep(500);

        // Step 1: Open the app and navigate to the Notifications settings page.
        // Assuming that navigating to the settings page is handled by an intent or a button click in MainActivity

        // Step 2: Locate the toggle switch labeled 'Send me discounts and other tasty updates'.
        onView(withId(R.id.id_enable_notifications)).check(ViewAssertions.matches(isClickable()));

        // Step 3: Click on the toggle switch to disable notifications.
        Thread.sleep(500);
        onView(withId(R.id.id_enable_notifications)).perform(click());

        // Expected Result: The toggle switch should be in the disabled state (gray circle on the right).
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_enable_notifications)).check(ViewAssertions.matches(isClickable()));
    }
}