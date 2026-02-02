package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14987_14987004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowPasswordTooShort() throws InterruptedException {
        // Step 1: Enter 'Pass123' in the 'Password' field
        onView(withId(R.id.password)).perform(ViewActions.typeText("Pass123"));

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click the 'SUBMIT' button
        onView(withContentDescription("[None]")).perform(click());

        Thread.sleep(500); // Wait for error message to appear

        // Expected Result: The user is presented with an error message for the 'Password' field
        onView(withId(R.id.password)).check(matches(ViewMatchers.withErrorText("Password must be at least 8 characters long")));
    }
}