package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatSpinner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.not;

@RunWith(AndroidJUnit4.class)
public class Test_11347_11347002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowAttemptToCreateATeamWithoutSelectingAPokmon() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'TEAMDEX' section.
        onView(withId(R.id.nav_teamdex)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Click on the 'Create a Team' option in the main content area.
        onView(withId(R.id.id_create_team)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Attempt to save the team without selecting any Pokémon.
        AppCompatSpinner spinner = (AppCompatSpinner) activityRule.getActivity().findViewById(R.id.id_team);
        if (!spinner.isClickable()) {
            throw new IllegalStateException("Spinner is not clickable");
        }
        
        Thread.sleep(500); // Wait for UI to update

        // Perform an invalid action on the spinner
        onView(withId(R.id.id_team)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Expected result: An error message should appear indicating that a Pokémon must be selected before creating a team.
        onView(withText("Please select at least one Pokémon")).check(matches(isDisplayed()));
    }
}