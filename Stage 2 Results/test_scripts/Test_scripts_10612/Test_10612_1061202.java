package com.example.tests;

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
public class Test_10612_1061202 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnCreateCircleButton() throws InterruptedException {
        // Navigate to screen 10612 (assuming it's the main activity for simplicity)
        Thread.sleep(500); // Wait for UI to load

        // Click on 'Create Circle' button
        onView(withId(R.id.id_create_circle_button)).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Assert that we are now on the Create Circle screen (assuming it has a text view with "Create Circle" as content description)
        onView(withText("Create Circle")).check(matches(isDisplayed()));
    }
}