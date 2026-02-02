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

@RunWith(AndroidJUnit4.class)
public class Test_10743_1074306 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserClicksOnTheConnectAppsAndDevicesButtonAfterSkipping throws InterruptedException {
        // Step 1: Open the fitness app (already done by ActivityTestRule)

        // Step 2: Click on the 'SKIP AND FINISH SIGN UP' button
        onView(withId(R.id.skip_and_finish_sign_up)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Click on the 'CONNECT APPS AND DEVICES' button
        onView(withId(R.id.id_connect_apps_devices)).perform(click());
        Thread.sleep(500); // Wait for UI to transition

        // Expected Result: The app transitions to the device and app connection screen
        onView(withId(R.id.device_and_app_connection_screen)).check(matches(isDisplayed()));
    }
}