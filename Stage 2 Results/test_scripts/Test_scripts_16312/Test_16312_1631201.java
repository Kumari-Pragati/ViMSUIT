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
public class Test_16312_1631201 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowEnterValidRouteNumberAndSubmit() throws InterruptedException {
        // Step 1: Open the Transit Tracker app (Assumed to be done by ActivityTestRule)
        
        // Step 2: Navigate to the form screen (Assumed to be done via UI or manually for simplicity)

        // Step 3: Enter '12345' into the 'route number' input field
        onView(withId(R.id.route_number_input)).perform(ViewActions.typeText("12345"));

        // Step 4: Tap the 'SUBMIT' button
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.id_submit_button)).perform(click());

        // Step 5: Verify that a confirmation message is displayed
        Thread.sleep(500); // Wait for UI to update
        onView(withText("Route number submitted successfully")).inRoot(isDialog()).check(matches(ViewMatchers.isDisplayed()));
    }
}