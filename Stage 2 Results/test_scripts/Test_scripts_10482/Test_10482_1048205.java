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

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10482_1048205 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInputFieldAccessibility() throws InterruptedException {
        // Navigate to the 'Phone for Checkout' screen (assuming it's the main activity)
        Espresso.onView(withId(R.id.id_editTextField)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for 500ms

        // Verify that the input field is accessible and can be interacted with
        Espresso.onView(withId(R.id.id_editTextField))
                .check(ViewAssertions.matches(isClickable()))
                .perform(ViewActions.typeText("1234567890"));

        Thread.sleep(500); // Wait for 500ms

        // Verify that the input field is still accessible and can be interacted with
        Espresso.onView(withId(R.id.id_editTextField))
                .check(ViewAssertions.matches(isClickable()));
    }
}