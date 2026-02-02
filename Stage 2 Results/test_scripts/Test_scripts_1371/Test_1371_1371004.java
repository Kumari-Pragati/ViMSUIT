package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1371_1371004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyFlightDetailsAreDisplayedCorrectlyInDifferentLanguages throws InterruptedException {
        // Step 1: Open the app and navigate to the flight itinerary screen.
        onView(withId(R.id.flight_itinerary_screen)).perform(click());

        // Step 2: Change the app language to a different language.
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait for UI to stabilize

        // Step 3: Verify the flight details are displayed correctly in the new language.
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.flight_details)).check(matches(withText("Expected Flight Details Text")));
    }
}