package com.example.tests;

import android.widget.Button;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_16312_1631203 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidRouteNumberSubmission() throws InterruptedException {
        // Step 1: Open the Transit Tracker app (Assumed to be done by the rule)
        
        // Step 2: Navigate to the form screen (Assumed to be done by the rule)
        
        // Step 3: Enter 'abcde' into the 'route number' input field
        onView(withId(R.id.route_number_input)).perform(clearText(), "abcde");
        
        // Step 4: Tap the 'SUBMIT' button
        Thread.sleep(500);
        onView(withId(R.id.id_submit_button)).perform(click());
        
        // Step 5: The app should display an error message indicating that the route number is invalid
        Thread.sleep(500);
        onView(withText("Invalid route number")).inRoot(ViewMatchers.withClassName(Button.class.getName()))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}