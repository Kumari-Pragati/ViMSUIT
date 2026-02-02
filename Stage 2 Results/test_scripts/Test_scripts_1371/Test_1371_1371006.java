package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1371_1371006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyFlightDetailsAreDisplayedCorrectlyAfterAppRestart throws InterruptedException {
        // Step 1: Open the app and navigate to the flight itinerary screen.
        onView(withId(R.id.flight_itinerary_screen)).perform(click());

        Thread.sleep(500); // Wait for UI to stabilize

        // Step 2: Restart the app
        activityRule.finishActivity();
        activityRule.launchActivity(null);

        Thread.sleep(500); // Wait for UI to stabilize after restart

        // Step 3: Verify the flight details are displayed correctly after app restart.
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait for UI to stabilize

        TextView flightDetailsTextView = (TextView) activityRule.getActivity().findViewById(R.id.flight_details_text_view);
        onView(withId(flightDetailsTextView.getId())).check(matches(isDisplayed()));
    }
}