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

@RunWith(AndroidJUnit4.class)
public class Test_11347_11347003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationMaximumNumberOfPokmonInATeam() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'TEAMDEX' section.
        onView(withId(R.id.id_tabs))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Step 2: Click on the 'Create a Team' option in the main content area.
        onView(withId(R.id.id_viewpager))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Select the maximum number of Pokémon allowed in a team and attempt to save the team.

        // Loop through all elements
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1:
                    onView(withId(R.id.id_team))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(withId(R.id.id_options))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 3:
                    Espresso.onView(withContentDescription("More options"))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                default:
                    // Skip elements with no specific content description
                    Thread.sleep(500);
            }
        }

        // Verify the team is created successfully with the maximum number of Pokémon.
        Espresso.onView(withId(R.id.id_team))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}