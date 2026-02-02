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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_18460_1846002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSelectIGoThroughPhasesAndProceedToTheNextStep() throws InterruptedException {
        // Step 1: Click on the 'I go through phases' option.
        onView(withId(R.id.id_active_phases_button)).perform(click());
        Thread.sleep(500);

        // Step 2: Click on the 'NEXT >' button.
        onView(withText("NEXT >")).perform(click());
        Thread.sleep(500);

        // Expected Result: The user should be directed to the next step of the fitness assessment process.
        // Here we can add assertions based on the expected UI elements or states after clicking NEXT
        onView(withId(R.id.next_step)).check(matches(withText("Expected Next Step Text")));
    }
}