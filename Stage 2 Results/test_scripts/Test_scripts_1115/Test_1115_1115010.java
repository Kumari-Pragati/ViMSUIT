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

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_1115_1115010 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignUpButtonShouldNotBeClickableIfNotLoggedIn() throws InterruptedException {
        // Ensure the user is not logged in.
        // This step might require additional logic to simulate an unlogged-in state, which is not shown here.

        // Click on the 'Sign Up' button at the bottom of the screen.
        Thread.sleep(500); // Wait for UI to stabilize

        onView(withId(R.id.id_button_sign_up)).check(ViewAssertions.not(isEnabled()));

        Thread.sleep(500); // Wait for UI to stabilize
    }
}