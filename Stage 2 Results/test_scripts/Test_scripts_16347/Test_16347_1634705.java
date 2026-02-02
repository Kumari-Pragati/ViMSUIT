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

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_16347_1634705 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForVolunteerOpportunitiesWithAnEmptySearchBar() throws InterruptedException {
        // Step 1: Open the app and navigate to the volunteer opportunity search screen.
        // Assuming MainActivity is the entry point and it navigates directly to the search screen

        // Step 2: Enter an empty string in the search bar
        Thread.sleep(500);
        onView(withId(R.id.id_project_search_view)).perform(ViewActions.clearText());

        // Step 3: Press the search button to initiate the search
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        Espresso.pressBack(); // Assuming back press triggers the search

        // Expected Result: An error message should be displayed indicating that the search bar is empty
        Thread.sleep(500);
        onView(withText(R.string.error_empty_search)).check(ViewAssertions.matches(withText("Search field cannot be empty")));

    }
}