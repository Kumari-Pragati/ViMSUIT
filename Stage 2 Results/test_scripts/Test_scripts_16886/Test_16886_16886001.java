package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_16886_16886001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyPropertyDetailsAreDisplayedCorrectly() throws InterruptedException {
        // Step 1: Open the app and navigate to the property listing screen.
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Verify the address, number of beds, and price are displayed correctly.
        // Assuming the views have resource IDs as follows:
        // R.id.addressTextView - Address
        // R.id.bedsTextView - Number of beds
        // R.id.priceTextView - Price

        // Check if the address is displayed correctly
        onView(withId(R.id.addressTextView)).check(matches(withText("Expected Address")));

        // Check if the number of beds is displayed correctly
        onView(withId(R.id.bedsTextView)).check(matches(withText("2 Beds")));

        // Check if the price is displayed correctly
        onView(withId(R.id.priceTextView)).check(matches(withText("$1000 per month")));
    }
}