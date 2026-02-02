package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12449_1244902 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowAttemptingToConfirmAnEmptySelection() throws InterruptedException {
        // Step 1: Open the app and navigate to the search functionality
        Thread.sleep(500); // Wait for the UI to load

        // Step 2: Tap on the 'Choose country to search in' header
        onView(withId(R.id.id_countries_list)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Ensure no country is selected
        onView(withId(R.id.id_countries_list)).check(matches(not(isDisplayed()))); // Assuming countries list is not displayed if empty

        // Step 4: Tap the 'OK' button
        Button okButton = activityTestRule.getActivity().findViewById(R.id.ok_button);
        okButton.performClick();
        Thread.sleep(500);

        // Expected Result: An error message is displayed indicating that a country must be selected
        onView(ViewMatchers.withText("Please select a country")).check(matches(isDisplayed()));
    }
}