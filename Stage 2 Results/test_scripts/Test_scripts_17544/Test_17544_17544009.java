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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17544_17544009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigation() throws InterruptedException {
        // Step 1: Open the SurveyMini app (Assuming it's already open, or this step is handled by setup)

        // Step 2: Click on the "Log in" button
        onView(withId(R.id.id_LoginButton)).perform(click());
        Thread.sleep(500);

        // Step 3: Click on the "Sign Up" button (Assuming it's available after clicking Log in)
        onView(withText("Sign Up")).perform(click());
        Thread.sleep(500);

        // Step 4: Click on the "Log in with Facebook" button
        onView(withText("Log in with Facebook")).perform(click());
        Thread.sleep(500);

        // Expected Result Assertions (Assuming specific views are present after each step)
        // For example, checking if a specific view is displayed or not

        // Check if the Sign Up screen is shown
        onView(withId(R.id.sign_up_screen_id)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Check if the Facebook login screen is shown (replace with actual resource ID)
        onView(withText("Facebook Login")).check(matches(isDisplayed()));
    }
}