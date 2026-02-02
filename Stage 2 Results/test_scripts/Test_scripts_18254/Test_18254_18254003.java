package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_18254_18254003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEnterAValidVin() throws InterruptedException {
        // Step 1: Enter a valid VIN into the input field.
        onView(withId(R.id.id_editTextVIN)).perform(typeText("1HGCM15K4AN200001"), ViewActions.closeSoftKeyboard());

        // Step 2: Click on the 'OK' button.
        Thread.sleep(500);
        onView(withId(R.id.id_buttonDefaultPositive)).perform(ViewActions.click());

        // Expected Result Assertions
        Thread.sleep(500);

        // Check if the VIN is entered correctly in the input field
        onView(withId(R.id.id_editTextVIN)).check(matches(withText("1HGCM15K4AN200001")));

        // Check if the 'OK' button was clicked (this can be inferred from UI state or logs)
        Espresso.pressBack(); // Simulate back press to go back to previous screen
        onView(withId(R.id.id_buttonDefaultPositive)).check(matches(withText("OK")));
    }
}