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
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_16312_1631202 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyRouteNumberSubmission() throws InterruptedException {
        // Step 1: Open the Transit Tracker app (already covered by ActivityTestRule)
        
        // Step 2: Navigate to the form screen (assuming it's already on the form screen)
        
        // Step 3: Tap the 'SUBMIT' button without entering a route number
        onView(withId(R.id.id_submit_button)).perform(click());
        Thread.sleep(500); // Wait for UI updates
        
        // Expected Result: The app should display an error message indicating that a route number is required
        onView(withText("Route number is required")).inRoot(isToast()).check(matches(isDisplayed()));
    }
}