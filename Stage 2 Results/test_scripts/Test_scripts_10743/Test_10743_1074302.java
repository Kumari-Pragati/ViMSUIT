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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10743_1074302 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserClicksOnTheConnectAppsAndDevicesButton() throws InterruptedException {
        // Navigate to the 'GET CONNECTED' screen (Assuming this is a step in MainActivity)
        onView(withText("GET CONNECTED")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Click on the 'CONNECT APPS AND DEVICES' button
        onView(withId(R.id.id_connect_apps_devices)).perform(click());
        
        Thread.sleep(500); // Wait for UI to transition
        
        // Assert that the app transitions to the device and app connection screen (Assuming this is a step in another activity)
        onView(withText("Device and App Connection")).check(matches(isDisplayed()));
    }
}