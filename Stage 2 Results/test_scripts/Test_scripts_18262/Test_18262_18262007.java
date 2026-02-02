package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_18262_18262007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationToSettingsScreenFromDeviceScreen() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Click on the 'Settings' option in the vertical menu
        onView(withId(R.id.id_navigationDrawerFragment_navigationExpandableList)).perform(ViewActions.click());

        // Wait for 500ms before checking if the Settings screen is displayed
        Thread.sleep(500);

        // Assert that the Settings screen is displayed
        Espresso.onView(withId(R.id.settings_screen_container)).check(matches(isDisplayed()));
    }
}