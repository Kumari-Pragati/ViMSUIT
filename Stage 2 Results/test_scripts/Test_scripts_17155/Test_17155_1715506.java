package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_17155_1715506 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyWarnMeBeforeExitingToggleSwitchDefaultState() throws InterruptedException {
        // Navigate to the Settings screen
        Espresso.onView(withContentDescription("Settings")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Verify that the 'Warn me before exiting' toggle switch is in its default state
        Espresso.onView(withContentDescription("[None]"))
                .check(matches(isDisplayed()));
        Thread.sleep(500); // Wait for UI to stabilize

        // Assuming the default state of the toggle switch is off (false)
        boolean isChecked = false; // Change this based on your application's default state
        Espresso.onView(withContentDescription("[None]"))
                .perform(ViewActions.scrollTo(), ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        if (!isChecked) {
            Espresso.onView(withContentDescription("[None]"))
                    .check(matches(not(isChecked)));
        } else {
            Espresso.onView(withContentDescription("[None]"))
                    .check(matches(isChecked));
        }
    }
}