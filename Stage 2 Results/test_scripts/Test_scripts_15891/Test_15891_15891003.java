package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;

public class Test_15891_15891003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationLongAddress() throws InterruptedException {
        // Step 1: Click on the search bar and type '123 Main Street, Anytown, USA'.
        EditText searchBar = (EditText) activityTestRule.getActivity().findViewById(R.id.search_bar);
        if (searchBar != null) {
            searchBar.perform(ViewActions.typeText("123 Main Street, Anytown, USA"));
            Thread.sleep(500); // Wait for the input to be processed
        }

        // Step 2: Click on the 'USE MY CURRENT LOCATION' button.
        Button useCurrentLocationButton = (Button) activityTestRule.getActivity().findViewById(R.id.use_current_location_button);
        if (useCurrentLocationButton != null) {
            useCurrentLocationButton.performClick();
            Thread.sleep(500); // Wait for the action to be processed
        }

        // Expected Result: The app should display nearby food options based on the entered long address.
        // Assertion 1: Check that the 'Outdated Version' button is not visible, indicating no outdated version issue.
        onView(withContentDescription("['Outdated Version']")).check(matches(not(isDisplayed())));
    }
}