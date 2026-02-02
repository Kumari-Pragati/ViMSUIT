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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17544_17544008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testButtonClickability() throws InterruptedException {
        // Step 1: Open the SurveyMini app (Assumed to be done by ActivityTestRule)

        // Step 2: Click on the "Log in" button
        onView(withId(R.id.id_LoginButton)).perform(click());
        
        Thread.sleep(500); // Wait for 500ms

        // Step 3: Click on the "Sign Up" button (Assuming it exists and has a unique ID)
        onView(withId(R.id.id_SignUpButton)).check(matches(isClickable()));
        onView(withId(R.id.id_SignUpButton)).perform(click());
        
        Thread.sleep(500); // Wait for 500ms

        // Step 4: Click on the "Log in with Facebook" button (Assuming it exists and has a unique ID)
        onView(withId(R.id.id_FacebookLoginButton)).check(matches(isClickable()));
        onView(withId(R.id.id_FacebookLoginButton)).perform(click());
        
        Thread.sleep(500); // Wait for 500ms

        // Expected Result: All buttons should be clickable
        Espresso.pressBack(); // Go back to the main screen if needed
    }
}