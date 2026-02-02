package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_14952_1495203 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidAgeSelection() throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        // Assuming the onboarding screen is already displayed

        // Step 2: Select an invalid age group in the 'Male' section.
        onView(withText("Male")).perform(click());
        Thread.sleep(500);

        // Step 3: Select an invalid age group in the 'Female' section.
        onView(withText("Female")).perform(click());
        Thread.sleep(500);

        // Step 4: Click on the 'SKIP' button at the bottom.
        onView(withId(R.id.id_next_btn)).perform(click());
        Thread.sleep(500);

        // EXPECTED RESULT:
        // The app should display an error message indicating invalid age selection.
        // The 'SKIP' button should be disabled after selection.

        // Check if the error message is displayed
        onView(withText("Invalid Age Selection")).check(matches(isDisplayed()));

        // Check if the SKIP button is disabled
        onView(withId(R.id.id_next_btn)).check(matches(ViewMatchers.enabled(false)));
    }
}