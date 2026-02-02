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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11347_11347004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testTogglesStateTeamNameVisibilityToggle() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'TEAMDEX' section.
        onView(withId(R.id.id_options)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click on the 'Create a Team' option in the main content area.
        onView(withId(R.id.create_team_button)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Toggle the visibility of the team name field and attempt to save the team.
        boolean isVisible = false; // Assume it's initially visible
        if (isVisible) {
            onView(withId(R.id.toggle_team_name)).perform(click());
            Thread.sleep(500); // Wait for UI to update
        } else {
            onView(withId(R.id.toggle_team_name)).perform(click());
            Thread.sleep(500); // Wait for UI to update
        }

        // Check if the team name field is visible or hidden as per the toggle state.
        if (isVisible) {
            onView(withId(R.id.team_name_input)).check(matches(isDisplayed()));
        } else {
            onView(withId(R.id.team_name_input)).check(matches(not(isDisplayed())));
        }

        // Attempt to save the team
        onView(withId(R.id.save_team_button)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Assert that the team is created successfully with the correct visibility state.
        if (isVisible) {
            Espresso.onView(allOf(withId(R.id.team_name_input), withText("Team Name"))).check(matches(isDisplayed()));
        } else {
            Espresso.onView(allOf(withId(R.id.team_name_input), not(withText("Team Name")))).check(matches(not(isDisplayed())));
        }
    }
}