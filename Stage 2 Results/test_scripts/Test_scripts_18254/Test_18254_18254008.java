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

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_18254_18254008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTestDataPersistence() throws InterruptedException {
        // Step 1: Enter a valid VIN into the input field.
        onView(withId(R.id.id_editTextVIN)).perform(clearText(), ViewActions.typeText("ABC1234567890"));

        // Step 2: Click on the 'OK' button.
        Thread.sleep(500);
        onView(withId(R.id.id_buttonDefaultPositive)).perform(click());

        // Step 3: Navigate away from the screen.
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                activityRule.getActivity().finish();
            }
        });

        Thread.sleep(500);

        // Step 4: Navigate back to the 'Add vehicle' screen.
        activityRule.launchActivity(null);

        // Step 5: The input field still contains the valid VIN.
        Thread.sleep(500);
        onView(withId(R.id.id_editTextVIN)).check(matches(ViewMatchers.withText("ABC1234567890")));
    }
}