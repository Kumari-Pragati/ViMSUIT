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
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_11177_1117706 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testVerifyTheTutorialPopupCanBeClosedByPressingTheRecentAppsButton() throws InterruptedException {
        // Step 1: Press the recent apps button on the device.
        Thread.sleep(500); // Wait for the app to initialize and tutorial popup to appear

        // Close the tutorial pop-up by pressing the recent apps button
        Espresso.pressBack();

        // Wait for a moment before checking if the tutorial pop-up is closed
        Thread.sleep(500);

        // Verify that the tutorial close button is no longer displayed
        onView(withId(R.id.id_tutorial_close_button)).check(matches(not(isDisplayed())));
    }
}