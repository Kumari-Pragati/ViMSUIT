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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15001_15001002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(30000);

    @Test
    public void testVerifyTheDisplayOfLigueMatches() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'France: Ligue 2' section.
        onView(withText("France")).perform(click());
        Thread.sleep(500);
        
        // Step 2: Verify that the section displays the correct matches with their times and teams.
        onView(withId(R.id.id_liste)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Assuming there is a match displayed as "Team A vs Team B at Time"
        String expectedMatch = "Team A vs Team B at 14:30";
        onView(withText(expectedMatch)).check(matches(isDisplayed()));

        // Additional assertions can be added here based on the actual UI elements
    }
}