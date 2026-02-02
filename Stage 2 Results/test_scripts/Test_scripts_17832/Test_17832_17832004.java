package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17832_17832004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidWeightInput() throws InterruptedException {
        // Step 1: Select 'Standard (lbs, ft, in)' from the weight unit dropdown.
        onView(withId(R.id.weight_unit_dropdown)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 2: Enter 'abc' in the 'Current Weight (in LBS)' input field.
        onView(withId(R.id.current_weight_input)).perform(ViewActions.typeText("abc"));
        Thread.sleep(500);

        // Step 3: Enter '160' in the 'Target Weight (in LBS)' input field.
        onView(withId(R.id.target_weight_input)).perform(ViewActions.typeText("160"));
        Thread.sleep(500);

        // Step 4: Select 'Height' from the height unit dropdown.
        onView(withId(R.id.height_unit_dropdown)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 5: Enter '5 ft 6 in' in the height input field.
        onView(withId(R.id.height_input)).perform(ViewActions.typeText("5 ft 6 in"));
        Thread.sleep(500);

        // Step 6: Click the 'Next' button at the bottom.
        onView(withId(R.id.id_signupstep1nextbutton)).perform(click());
        Thread.sleep(500);

        // Expected Result: An error message should be displayed indicating invalid weight input.
        onView(withText("Invalid weight input")).inRoot(ViewMatchers.withClassName(
                "android.widget.Toast")).check(matches(isDisplayed()));
    }
}