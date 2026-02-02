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

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_14952_1495204 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000);

    @Test
    public void testNegativeFlowMissingAgeSelection() throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        // This step is assumed as the activity starts with the onboarding screen.

        // Step 2: Click on the 'SKIP' button at the bottom without selecting an age group.
        onView(withId(R.id.id_next_btn)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result:
        // The app should display an error message indicating missing age selection.
        // The 'SKIP' button should be disabled after selection.

        // Check if the skip button is not clickable
        onView(withId(R.id.id_next_btn)).check(matches(isClickable(false)));

        // Check for error message (assuming error message has a specific text)
        Espresso.onView(withText("Please select your age group")).inRoot(isDialog()).check(ViewAssertions.matches(isDisplayed()));
    }
}