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
public class Test_16347_1634707 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForVolunteerOpportunitiesWithNumbersInTheSearchBar() throws InterruptedException {
        // Step 1: Open the app and navigate to the volunteer opportunity search screen.
        // Assuming the main activity opens the search screen directly or through a navigation action.

        // Step 2: Enter '1234567890' in the search bar.
        Thread.sleep(500);
        onView(withId(R.id.id_project_search_view)).perform(ViewActions.typeText("1234567890"));

        // Step 3: Press the search button to initiate the search.
        Thread.sleep(500);
        Espresso.pressBack(); // Assuming there's a back button or similar action to trigger the search
        Thread.sleep(500);

        // Expected Result: An error message should be displayed indicating that the search bar contains invalid characters.
        onView(withText("Invalid input")).check(ViewAssertions.matches(withText("Invalid input")));
    }
}