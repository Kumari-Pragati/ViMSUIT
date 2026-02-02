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
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;

@RunWith(AndroidJUnit4.class)
public class Test_14952_1495206 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testAccessibilityTestSkipButton() throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        // This step is assumed to be handled by the ActivityTestRule.

        // Step 2: Verify that the 'SKIP' button is accessible.
        Thread.sleep(500); // Wait for UI to load

        // Find the skip button
        onView(withId(R.id.id_next_btn)).check(matches(isClickable() && isEnabled()));

        // Additional check to ensure the text is "Skip"
        Espresso.onView(withId(R.id.id_next_btn))
                .perform(ViewActions.click())
                .check(matches(withText("Skip")));
    }
}