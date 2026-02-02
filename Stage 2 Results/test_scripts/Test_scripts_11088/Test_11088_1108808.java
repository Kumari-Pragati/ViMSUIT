package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_11088_1108808 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyToggleSwitchIsClickableWhenDisabled throws InterruptedException {
        // Step 1: Open the app and navigate to the Notifications settings page.
        // Assuming the main activity has a method to navigate to notifications settings
        Espresso.onView(withId(R.id.notifications_settings)).perform(click());

        Thread.sleep(500);

        // Step 2: Locate the toggle switch labeled 'Send me discounts and other tasty updates'.
        onView(withId(R.id.id_enable_notifications)).check(ViewAssertions.matches(isClickable()));

        Thread.sleep(500);

        // Step 3: Click on the toggle switch to disable notifications.
        Espresso.onView(withId(R.id.id_enable_notifications)).perform(click());

        Thread.sleep(500);

        // Step 4: Attempt to click on the toggle switch again.
        Espresso.onView(withId(R.id.id_enable_notifications)).perform(click());
    }
}