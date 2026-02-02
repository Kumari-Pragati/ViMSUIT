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
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1028_102802 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEnabledisableTemperatureDisplay() throws InterruptedException {
        // Navigate to the Weather Notifications screen (assuming it's already on this screen)
        
        // Click on the toggle switch for displaying the current temperature
        onView(withId(R.id.id_settings_temperature_display_switch)).perform(click());
        Thread.sleep(500); // Wait for UI updates
        
        // Verify that the toggle switch reflects the correct state
        // Initially, assume it is disabled and should be enabled after click
        onView(withId(R.id.id_settings_temperature_display_switch)).check(matches(isChecked()));
        
        // Click again to disable it
        Thread.sleep(500); // Wait for UI updates
        onView(withId(R.id.id_settings_temperature_display_switch)).perform(click());
        Thread.sleep(500); // Wait for UI updates
        
        // Verify that the toggle switch reflects the correct state after being disabled
        // Initially, assume it is enabled and should be disabled after second click
        onView(withId(R.id.id_settings_temperature_display_switch)).check(matches(isNotChecked()));
    }
}