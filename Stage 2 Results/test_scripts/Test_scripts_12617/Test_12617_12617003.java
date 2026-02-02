package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Test_12617_12617003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyPreseasonGameResultsDisplay() throws InterruptedException {
        // Step 1: Open the app and navigate to the profile screen.
        Espresso.onView(ViewMatchers.withText("Profile")).perform(ViewActions.click());

        // Step 2: Verify that the list of pre-season game results is displayed correctly.
        Thread.sleep(500); // Wait for UI to update

        // Check if the ListView is present
        onView(withId(R.id.id_list)).check(matches(isDisplayed()));

        // Assuming there are at least two items in the list, check their content
        Thread.sleep(500);
        onView(withId(R.id.id_list)).perform(ViewActions.scrollToPosition(1));
        Thread.sleep(500);

        // Example assertion for team name (adjust according to actual UI)
        Espresso.onView(withText("Team A")).check(matches(isDisplayed()));

        // Example assertion for score (adjust according to actual UI)
        Espresso.onView(withText("Score: 24-17")).check(matches(isDisplayed()));

        // Example assertion for date (adjust according to actual UI)
        Espresso.onView(withText("Date: 08/05/2023")).check(matches(isDisplayed()));
    }
}