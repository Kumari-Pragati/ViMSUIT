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
public class Test_18254_18254004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEnterAnInvalidVin() throws InterruptedException {
        // Step 1: Enter an invalid VIN into the input field.
        Espresso.onView(withId(R.id.id_vinInputField))
                .perform(ViewActions.typeText("invalidVIN"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 2: Click on the 'OK' button.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_buttonDefaultPositive))
                .perform(ViewActions.click())
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Additional assertions can be added here if necessary
    }
}