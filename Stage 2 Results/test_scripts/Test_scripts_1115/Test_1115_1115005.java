package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_1115_1115005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignUpButtonShouldBeClickable() throws InterruptedException {
        // Wait for the view to be clickable and visible
        Thread.sleep(500);
        
        // Find the 'Sign Up' button using its ID
        onView(withId(R.id.id_button_sign_up)).check(ViewAssertions.matches(isClickable()));

        // Wait for another 500ms before proceeding
        Thread.sleep(500);

        // Perform a click on the 'Sign Up' button
        Espresso.onView(withId(R.id.id_button_sign_up)).perform(click());

        // Wait for another 500ms after clicking
        Thread.sleep(500);
    }
}