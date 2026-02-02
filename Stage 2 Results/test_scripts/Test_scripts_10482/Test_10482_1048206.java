package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isFocusable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10482_1048206 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(5000);

    @Test
    public void testInputFieldUsability() throws InterruptedException {
        // Navigate to the 'Phone for Checkout' screen (assuming it's the main activity)
        Espresso.onView(withId(R.id.id_editTextField)).check(ViewAssertions.matches(isClickable()));
        Espresso.onView(withId(R.id.id_editTextField)).check(ViewAssertions.matches(isFocusable()));

        // Tap on the text input field labeled 'Phone'
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_editTextField)).perform(ViewActions.click());

        // Enter a valid phone number '123-456-7890'
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_editTextField)).perform(ViewActions.typeText("123-456-7890"));

        // Verify that the input field is easy to use and does not have any usability issues
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_editTextField)).check(ViewAssertions.matches(isClickable()));
        Espresso.onView(withId(R.id.id_editTextField)).check(ViewAssertions.matches(isFocusable()));

        // Additional checks can be added here if necessary
    }
}