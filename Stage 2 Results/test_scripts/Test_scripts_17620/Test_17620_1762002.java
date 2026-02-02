package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_17620_1762002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckIfTheButtonIsClickable() throws InterruptedException {
        // Step 1: Open the NextRadio app (assumed to be done by the rule)
        
        // Step 2: Navigate to the screen displaying the informational message about FM radio unavailability
        // This step is assumed as part of the application flow and not explicitly coded here.
        
        // Step 3: Click on the 'ENTER TO WIN $10,000!' button
        Thread.sleep(500); // Wait for UI to stabilize
        
        onView(withId(R.id.id_txtNoRadioLink)).perform(click());
        
        // Step 4: The button should respond to the click action (assertion)
        Thread.sleep(500); // Wait for any potential side effects or transitions
        onView(withId(R.id.id_txtNoRadioLink)).check(matches(isClickable()));
    }
}