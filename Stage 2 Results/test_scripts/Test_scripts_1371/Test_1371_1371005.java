package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.AdapterView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_1371_1371005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyFlightDetailsAreDisplayedCorrectlyAfterDeviceRotation() throws InterruptedException {
        // Step 1: Open the app and navigate to the flight itinerary screen.
        // Assuming that clicking on a specific view or button will take us to the flight itinerary screen
        onView(allOf(withContentDescription("Flights"), isDisplayed())).perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Rotate the device.
        activityRule.getActivity().overrideConfiguration(activityRule.getActivity().getResources().getConfiguration());
        activityRule.getActivity().recreate();

        Thread.sleep(500); // Wait for UI to update after rotation

        // Step 3: Verify the flight details are displayed correctly after device rotation.
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));

        // Assuming that there is a specific view or text that should be present
        // Replace "R.id.flight_details" with actual resource ID of your flight details view
        onView(allOf(withId(R.id.flight_details), isDisplayed())).check(matches(isDisplayed()));
    }
}