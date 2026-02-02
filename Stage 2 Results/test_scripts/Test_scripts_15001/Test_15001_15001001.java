package com.example.tests;

import android.widget.ListView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_15001_15001001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheDisplayOfLigueMatches() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'France: Ligue 1' section.
        onView(withId(R.id.nav_view)).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Step 2: Verify that the section displays the correct matches with their times and teams.
        onView(withText("France: Ligue 1")).perform(click());
        Thread.sleep(500); // Wait for content to load

        // Check if the ListView is clickable and focusable
        onView(withId(R.id.id_liste)).check(matches(ViewMatchers.isClickable()));
        onView(withId(R.id.id_liste)).check(matches(ViewMatchers.isFocusable()));

        // Verify that the correct matches are displayed (example assertion)
        String match1 = "Match 1: Team A vs Team B - 15:00";
        String match2 = "Match 2: Team C vs Team D - 17:30";

        // Assuming each match is a list item with text
        onView(withText(match1)).check(matches(ViewMatchers.isDisplayed()));
        onView(withText(match2)).check(matches(ViewMatchers.isDisplayed()));

        // Additional checks can be added as needed
    }
}