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

@RunWith(AndroidJUnit4.class)
public class Test_17832_17832001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowCompleteBmiCalculatorSetupWithValidInputs() throws InterruptedException {
        // Step 1: Select 'Standard (lbs, ft, in)' from the weight unit dropdown.
        Espresso.onView(ViewMatchers.withId(R.id.weight_unit_spinner))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Assuming "Standard" is the first item in the spinner
        Espresso.onView(ViewMatchers.withText("Standard"))
                .perform(ViewActions.click());

        // Step 2: Enter '150' in the 'Current Weight (in LBS)' input field.
        Espresso.onView(ViewMatchers.withId(R.id.current_weight_input))
                .perform(ViewActions.typeText("150"));

        // Step 3: Enter '160' in the 'Target Weight (in LBS)' input field.
        Espresso.onView(ViewMatchers.withId(R.id.target_weight_input))
                .perform(ViewActions.typeText("160"));

        // Step 4: Select 'Height' from the height unit dropdown.
        Espresso.onView(ViewMatchers.withId(R.id.height_unit_spinner))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Assuming "Height" is the first item in the spinner
        Espresso.onView(ViewMatchers.withText("Height"))
                .perform(ViewActions.click());

        // Step 5: Enter '5 ft 6 in' in the height input field.
        Espresso.onView(ViewMatchers.withId(R.id.height_input))
                .perform(ViewActions.typeText("5 ft 6 in"));

        // Step 6: Click the 'Next' button at the bottom.
        Espresso.onView(withId(R.id.id_signupstep1nextbutton))
                .check(matches(isDisplayed()))
                .perform(ViewActions.click());

        Thread.sleep(500);

        // Expected Result: The BMI calculation should be displayed
        Espresso.onView(ViewMatchers.withId(R.id.bmi_result_textview))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}