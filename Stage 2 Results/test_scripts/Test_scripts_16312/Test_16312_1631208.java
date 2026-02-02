package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_16312_1631208 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyFormNavigation() throws InterruptedException {
        // Step 1: Open the Transit Tracker app (already covered by ActivityTestRule)
        
        // Step 2: Navigate to the form screen
        Espresso.onView(withId(R.id.form_screen)).check(ViewAssertions.matches(withText("Enter Route Number"))).performClick();
        
        Thread.sleep(500); // Wait for UI to stabilize
        
        // Step 3: Tap the 'SUBMIT' button without entering a route number
        Espresso.onView(withId(R.id.id_submit_button)).performClick();
        
        Thread.sleep(500); // Wait for error message to appear
        
        // Expected Result: The app should display an error message indicating that a route number is required
        Espresso.onView(withText("Route Number is required")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}