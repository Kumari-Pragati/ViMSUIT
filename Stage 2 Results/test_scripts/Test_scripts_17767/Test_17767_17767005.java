package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17767_17767005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenCameraAndCheckModeIconsFunctionality() throws InterruptedException {
        // Step 1: Open the app and navigate to the camera screen (Assuming it's already open)
        
        // Step 2: Click on one of the four mode icons to switch to a different camera mode
        onView(withId(R.id.id_mode_options)).perform(click());
        Thread.sleep(500); // Wait for the view to update
        
        // Assuming there are four modes, click on the first one as an example
        onView(withText("Mode 1")).inRoot(withDecorView(not(isRootView()))).perform(click());
        Thread.sleep(500); // Wait for the mode change

        // Step 3: Verify that the camera has switched to the selected mode
        // Assuming "Mode 1" is a text description of one of the modes
        onView(withText("Mode 1")).check(matches(isDisplayed()));
    }
}