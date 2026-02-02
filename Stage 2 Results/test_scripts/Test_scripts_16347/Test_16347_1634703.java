package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;

public class Test_16347_1634703 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForVolunteerOpportunitiesUsingTheAdvancedSearchOption() throws InterruptedException {
        // Step 1: Open the app and navigate to the volunteer opportunity search screen.
        // Assuming the main activity has a button or some other way to navigate to the search screen

        // Step 2: Tap on the 'advanced search' button
        Thread.sleep(500);
        onView(withId(R.id.id_project_search_advanced)).perform(ViewActions.click());

        // Step 3: Enter search criteria and press the search button to initiate the search.
        // Assuming there is a search button with id R.id.search_button
        Thread.sleep(500);
        Espresso.onView(withId(R.id.search_button)).perform(ViewActions.click());

        // Expected Result: Search results for volunteer opportunities matching the advanced search criteria should be displayed.
        // Assuming there is a view that displays the search results, e.g., a RecyclerView with id R.id.search_results
        Thread.sleep(500);
        Espresso.onView(withId(R.id.search_results)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}