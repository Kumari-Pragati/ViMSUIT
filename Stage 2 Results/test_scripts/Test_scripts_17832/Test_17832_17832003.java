package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Test_17832_17832003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowMissingHeightUnitSelection() throws InterruptedException {
        // Step 1: Select 'Standard (lbs, ft, in)' from the weight unit dropdown.
        Espresso.onView(withId(R.id.weight_unit_dropdown)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 2: Enter '150' in the 'Current Weight (in LBS)' input field.
        Espresso.onView(withId(R.id.current_weight_input))
                .perform(ViewActions.typeText("150"));
        Thread.sleep(500);

        // Step 3: Enter '160' in the 'Target Weight (in LBS)' input field.
        Espresso.onView(withId(R.id.target_weight_input))
                .perform(ViewActions.typeText("160"));
        Thread.sleep(500);

        // Step 4: Select 'Height' from the height unit dropdown.
        Espresso.onView(withId(R.id.height_unit_dropdown)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 5: Enter '5 ft 6 in' in the height input field.
        Espresso.onView(withId(R.id.height_input))
                .perform(ViewActions.typeText("5 ft 6 in"));
        Thread.sleep(500);

        // Step 6: Click the 'Next' button at the bottom.
        Espresso.onView(withId(R.id.id_signupstep1nextbutton)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected result: An error message should be displayed indicating missing height unit selection.
        Espresso.onView(withText("Please select a height unit"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}