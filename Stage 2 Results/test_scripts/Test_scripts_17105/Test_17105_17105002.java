package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class Test_17105_17105002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // No setup needed for this test case
    }

    @Test
    public void testVerifyThePropertyTitleAndDetails() throws InterruptedException {
        // Step 1: Open the property listing for Thompson St #6.
        Espresso.onView(ViewMatchers.withId(R.id.id_check_availability_button)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Verify that the property title is 'Thompson St #6'.
        Espresso.onView(ViewMatchers.withText("Thompson St #6")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Verify that the property details are '$2,750 | 1 Bed' and 'New York, NY 10012'.
        Espresso.onView(ViewMatchers.withText("Property Details")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        Button propertyDetailsButton = activityTestRule.getActivity().findViewById(R.id.property_details_button);
        propertyDetailsButton.perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        Espresso.onView(ViewMatchers.withText("$2,750 | 1 Bed")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        Thread.sleep(500); // Wait for UI to update

        Espresso.onView(ViewMatchers.withText("New York, NY 10012")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}