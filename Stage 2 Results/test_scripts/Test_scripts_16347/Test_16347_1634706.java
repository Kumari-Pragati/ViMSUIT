package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(JUnit4.class)
public class Test_16347_1634706 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForVolunteerOpportunitiesWithSpecialCharactersInTheSearchBar() throws InterruptedException {
        // Step 1: Open the app and navigate to the volunteer opportunity search screen.
        // Assuming the main activity has a button or some way to navigate to the search screen

        // Step 2: Enter '!@#$%^&*()' in the search bar
        onView(allOf(withId(R.id.id_project_search_view), isDisplayed())).perform(ViewActions.typeText("!@#$%^&*()"));

        // Step 3: Press the search button to initiate the search.
        Thread.sleep(500); // Wait for UI updates

        // Assuming there's a search button with id R.id.search_button
        onView(withId(R.id.search_button)).perform(click());

        // Expected result: An error message should be displayed indicating that the search bar contains invalid characters.
        Thread.sleep(500); // Wait for UI updates

        // Check if an error message is displayed
        onView(allOf(withId(android.R.id.message), isDisplayed())).check(matches(ViewMatchers.withText("Invalid characters in search query")));
    }
}