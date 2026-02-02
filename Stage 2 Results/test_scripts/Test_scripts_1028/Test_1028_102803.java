package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;

@RunWith(AndroidJUnit4.class)
public class Test_1028_102803 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testEnabledisableLockScreenWeatherBanner() throws InterruptedException {
        // Navigate to the Weather Notifications screen (assuming it's already open or can be navigated)
        
        // Click on the toggle switch for displaying the weather on the lock screen
        onView(withId(R.id.id_settings_temperature_display_switch)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI updates
        
        // Verify that the toggle switch reflects the correct state (enabled)
        onView(withId(R.id.id_settings_temperature_display_switch)).check(ViewAssertions.matches(isChecked()));
        
        // Click on the toggle switch again to disable it
        onView(withId(R.id.id_settings_temperature_display_switch)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI updates
        
        // Verify that the toggle switch reflects the correct state (disabled)
        onView(withId(R.id.id_settings_temperature_display_switch)).check(ViewAssertions.matches(isNotChecked()));
    }
}