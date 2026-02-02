package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_18717_18717002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheStepButton() throws InterruptedException {
        // Step 1: Click on the 'Step' button at the bottom of the screen.
        Thread.sleep(500); // Wait for initial setup

        onView(allOf(withId(R.id.id_btnStepTest))).perform(ViewActions.click());

        Thread.sleep(500); // Wait before checking the result

        // Expected Result: The next step of the Bubble Sort algorithm should be executed.
        // Assuming there is a view or text that indicates the current state of the algorithm
        // For example, if the algorithm's current step is displayed in a TextView with id R.id.currentStepTextView
        Espresso.onView(withId(R.id.currentStepTextView)).check(matches(isDisplayed()));
    }
}