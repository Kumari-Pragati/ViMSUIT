package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11082_1108202 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testConnectWithEmailPositiveFlow() throws InterruptedException {
        // Step 1: Open the Ticketpop app (Assuming it's already open, or this step is handled by ActivityTestRule)

        // Step 2: Click on the 'Connect with Email' button
        onView(withId(R.id.id_btn_login)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The user should be redirected to the email login page
        onView(withText("Sign In")).inRoot(isDialog()).check(matches(isDisplayed()));
        Thread.sleep(500); // Wait for UI to update

        // Assuming successful login, redirect back to Ticketpop app (Assertion based on expected behavior)
        Espresso.pressBack();
        Thread.sleep(500); // Wait for UI to update
        onView(withText("Welcome")).check(matches(isDisplayed())); // Replace "Welcome" with actual text or identifier if known
    }
}