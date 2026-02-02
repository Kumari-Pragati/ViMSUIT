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
public class Test_13079_1307905 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheRedCircularButtonWithAPlusSign() throws InterruptedException {
        // Step 1: Click on the red circular button with a plus sign
        onView(withId(R.id.id_fab)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: A new vehicle configuration option is added
        Espresso.onView(withId(R.id.vehicle_configurations_list))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}