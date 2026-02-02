package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Spinner;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17832_17832002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowMissingWeightUnitSelection() throws InterruptedException {
        // Select 'Standard (lbs, ft, in)' from the weight unit dropdown.
        onView(withId(R.id.weight_unit_spinner)).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Enter '150' in the 'Current Weight (in LBS)' input field.
        onView(withId(R.id.current_weight_input)).perform(clearText(), ViewActions.typeText("150"));
        Thread.sleep(500);

        // Enter '160' in the 'Target Weight (in LBS)' input field.
        onView(withId(R.id.target_weight_input)).perform(clearText(), ViewActions.typeText("160"));
        Thread.sleep(500);
        
        // Select 'Height' from the height unit dropdown.
        onView(withId(R.id.height_unit_spinner)).perform(ViewActions.click());
        Thread.sleep(500);

        // Enter '5 ft 6 in' in the height input field.
        onView(withId(R.id.height_input)).perform(clearText(), ViewActions.typeText("5 ft 6 in"));
        Thread.sleep(500);
        
        // Click the 'Next' button at the bottom.
        onView(withId(R.id.id_signupstep1nextbutton)).perform(click());
        Thread.sleep(500);

        // Assert that an error message is displayed indicating missing weight unit selection.
        onView(withText("Please select a weight unit")).inRoot(ViewMatchers.withParent(
                ViewMatchers.isAssignableFrom(Spinner.class))).check(matches(ViewMatchers.isDisplayed()));
    }
}