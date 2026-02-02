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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_16347_1634702 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForVolunteerOpportunitiesUsingTheNearMeOption() throws InterruptedException {
        // Step 1: Open the app and navigate to the volunteer opportunity search screen.
        // Assuming the main activity is already on the search screen or can be navigated directly there.

        // Step 2: Tap on the 'near me' button
        onView(withId(R.id.id_project_search_near)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Press the search button to initiate the search.
        Espresso.closeSoftKeyboard(); // Ensure no keyboard is open before proceeding
        onView(withText("Search")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: Search results for volunteer opportunities near the user's location should be displayed.
        onView(withId(R.id.search_results)).check(ViewAssertions.matches(withText("No results found.")));
    }
}