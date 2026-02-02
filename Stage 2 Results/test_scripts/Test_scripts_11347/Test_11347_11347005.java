package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Spinner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_11347_11347005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInputValidationInvalidTeamName() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'TEAMDEX' section.
        onView(withId(R.id.nav_teamdex)).perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click on the 'Create a Team' option in the main content area.
        onView(withId(R.id.create_team_button)).perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Enter an invalid team name and attempt to save the team.
        Spinner teamSpinner = (Spinner) activityRule.getActivity().findViewById(R.id.id_team);
        teamSpinner.setSelection(0); // Select first item as a placeholder
        onView(withId(R.id.id_team)).perform(ViewActions.typeText("InvalidName!"), ViewActions.closeSoftKeyboard());

        Thread.sleep(500); // Wait for UI to update

        Espresso.pressBack(); // Go back to previous screen

        Thread.sleep(500); // Wait for UI to update

        // Expected Result: An error message should appear indicating that the team name is invalid.
        onView(withText("Team name must be a valid string.")).check(matches(ViewMatchers.isDisplayed()));
    }
}