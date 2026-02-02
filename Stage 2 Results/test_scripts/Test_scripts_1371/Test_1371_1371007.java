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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_1371_1371007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyFlightDetailsAreDisplayedCorrectlyAfterAppUpdate() throws InterruptedException {
        // Step 1: Open the app and navigate to the flight itinerary screen.
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Update the app (Assuming an update is simulated by restarting the activity)
        activityRule.finishActivity();
        Thread.sleep(1000); // Wait for activity to finish and potential updates
        activityRule.launchActivity(null);
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Verify the flight details are displayed correctly after app update.
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}