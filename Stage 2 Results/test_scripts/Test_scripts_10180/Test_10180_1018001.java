package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.HeaderGridView;

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
public class Test_10180_1018001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndNavigateToTheMoviesScreen() throws InterruptedException {
        // Step 1: Open the Movie Streaming App (Assumed to be done by the rule)

        // Step 2: Navigate to the MOVIES screen
        onView(withId(R.id.nav_movies)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The MOVIES screen should be displayed with a list of movies
        onView(withId(R.id.id_grid_view)).check(matches(isDisplayed()));
    }
}