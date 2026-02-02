package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;

@RunWith(AndroidJUnit4.class)
public class Test_18717_18717007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheResetAndStepButtonInteraction() throws InterruptedException {
        // Step 1: Click on the 'Reset' button.
        onView(withId(R.id.id_btnResetTest)).perform(click());

        // Step 2: Click on the 'Step' button multiple times.
        for (int i = 0; i < 5; i++) { // Assuming we want to step through 5 steps
            Thread.sleep(500); // Wait for 500ms between interactions
            onView(withId(R.id.id_btnStepTest)).perform(click()); // Assuming the Step button ID is R.id.id_btnStepTest

            // Assertion: Check if the array has been updated as expected after each step.
            // This would typically involve checking the state of some UI element or data model.
            // For demonstration, we'll just check that the 'Step' button remains clickable.
            onView(withId(R.id.id_btnStepTest)).check(matches(isEnabled()));
        }
    }
}