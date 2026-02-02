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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_16347_1634704 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForVolunteerOpportunitiesWithAnInvalidLocation() throws InterruptedException {
        // Step 1: Open the app and navigate to the volunteer opportunity search screen.
        // Assuming the main activity opens the search screen directly or through a navigation drawer.

        // Step 2: Enter 'Invalid City, CA' in the search bar.
        onView(withId(R.id.id_project_search_view)).perform(ViewActions.typeText("Invalid City, CA"));

        // Step 3: Press the search button to initiate the search.
        Thread.sleep(500); // Wait for UI updates
        Espresso.closeSoftKeyboard();
        onView(withText("Search")).perform(click());

        // Expected Result: An error message should be displayed indicating that the location is invalid.
        Thread.sleep(500); // Wait for UI updates
        onView(withText("Invalid location. Please try again.")).check(matches(ViewMatchers.isDisplayed()));
    }
}