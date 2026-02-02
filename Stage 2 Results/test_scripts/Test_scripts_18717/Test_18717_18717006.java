package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_18717_18717006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheStepAndRunButtonInteraction() throws InterruptedException {
        // Step 1: Click on the 'Step' button multiple times.
        onView(withId(R.id.id_btnStepTest)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms to ensure the step is executed
        onView(withId(R.id.id_btnStepTest)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 2: Click on the 'Run' button.
        Espresso.onView(withId(R.id.id_btnRunTest)).perform(ViewActions.click());

        // Expected Result Assertions
        // Assuming there is a view that shows the state of the Bubble Sort algorithm (e.g., a TextView)
        // and it should show "Sorted" when the array is sorted.

        // Check if the 'Step' button interaction has executed correctly.
        Espresso.onView(withId(R.id.id_btnStepTest)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Check if the 'Run' button execution has completed (this might require a custom matcher or view)
        // For example, checking for a "Sorted" message
        Espresso.onView(withId(R.id.id_resultView)).check(ViewAssertions.matches(ViewMatchers.withText("Sorted")));
    }
}