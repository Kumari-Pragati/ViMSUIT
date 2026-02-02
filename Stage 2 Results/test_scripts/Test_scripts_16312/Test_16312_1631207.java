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
import org.junit.runners.JUnit4;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_16312_1631207 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSpecialCharactersRouteNumberSubmission() throws InterruptedException {
        // Step 1: Open the Transit Tracker app (Assuming it's already open)
        
        // Step 2: Navigate to the form screen (Assuming this is the initial screen)
        
        // Step 3: Enter '!@#$%^&*()' into the 'route number' input field
        onView(withId(R.id.route_number_input)).perform(ViewActions.typeText("!@#$%^&*()"));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Tap the 'SUBMIT' button
        onView(withId(R.id.id_submit_button)).perform(click());
        
        Thread.sleep(500); // Wait for error message to appear
        
        // Expected Result: The app should display an error message indicating that the route number contains special characters.
        onView(withText("Route number cannot contain special characters")).inRoot(isToast()).check(matches(ViewMatchers.isDisplayed()));
    }
}