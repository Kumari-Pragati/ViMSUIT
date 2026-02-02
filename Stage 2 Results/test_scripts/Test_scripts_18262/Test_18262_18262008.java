package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
public class Test_18262_18262008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationToDeviceScreenFromDeviceScreen() throws InterruptedException {
        // Wait for the UI to load
        Thread.sleep(500);

        // Click on the 'Device' option in the vertical menu to navigate back to the Device screen.
        onView(withId(R.id.id_navigationDrawerFragment_navigationExpandableList)).perform(ViewActions.click());

        // Wait for the UI to update after navigation
        Thread.sleep(500);

        // Verify that the Device screen is displayed
        Espresso.onView(withId(R.id.device_screen_container)).check(matches(isDisplayed()));
    }
}