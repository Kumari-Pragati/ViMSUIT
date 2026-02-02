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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17767_17767003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testOpenCameraAndSwitchToADifferentMode() throws InterruptedException {
        // Step 1: Open the app and navigate to the camera screen (Assuming it's already open)
        
        // Step 2: Click on one of the four mode icons to switch to a different camera mode
        onView(withId(R.id.id_mode_options)).perform(click());
        Thread.sleep(500); // Wait for the UI to update

        // Assuming there are four modes, click on the second one (index 1)
        onView(withText("Mode2")).inRoot(withDecorView(not(isRootView()))).perform(click());
        Thread.sleep(500); // Wait for the mode change
        
        // Step 3: Verify that the camera has switched to the selected mode
        // Assuming "Mode2" is displayed somewhere on the screen
        onView(withText("Mode2")).check(matches(isDisplayed()));
    }
}