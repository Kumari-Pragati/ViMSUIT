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
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16617_16617004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheLetsGetStartedButtonIsClickable() throws InterruptedException {
        // Wait for the UI to load and stabilize
        Thread.sleep(500);

        // Step 1: Open the app and navigate to screen 16617 (assuming it's the main activity)
        // Step 2: Click on the 'Let's Get Started' button

        // Verify that the button is clickable
        onView(withId(R.id.id_continue_button)).check(matches(isClickable()));

        // Perform the click action
        Thread.sleep(500);
        onView(withId(R.id.id_continue_button)).perform(click());

        // Add any additional assertions if necessary (e.g., checking for a new screen)
    }
}