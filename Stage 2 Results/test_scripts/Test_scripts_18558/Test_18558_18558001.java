package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_18558_18558001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowUserSelectsGenderAndProceedsToNextStep() throws InterruptedException {
        // Step 1: Click on the 'I am male' toggle button.
        onView(withId(R.id.id_button1)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click on the 'I am female' toggle button.
        Espresso.closeSoftKeyboard(); // Close soft keyboard if open
        onView(withId(R.id.id_button1)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Click on the progress indicator to proceed to the next step.
        Espresso.onView(withId(R.id.id_button1)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result Assertions
        Espresso.onView(withId(R.id.id_button1)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}