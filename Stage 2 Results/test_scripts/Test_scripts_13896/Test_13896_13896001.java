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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13896_13896001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateBackToThePreviousScreen() throws InterruptedException {
        // Wait for the view to be displayed before interacting with it
        onView(withId(R.id.drawable_an_31)).check(matches(isDisplayed()));

        // Click on the blue chevron button in the top left corner
        Thread.sleep(500);
        onView(withId(R.id.drawable_an_31)).perform(click());

        // Wait for 500ms to ensure navigation is complete before assertion
        Thread.sleep(500);

        // Assert that the user is navigated back to the previous screen
        // This can be done by checking if a specific view from the previous screen is displayed
        // For example, check if a view with id R.id.some_previous_screen_view is displayed
        onView(withId(R.id.some_previous_screen_view)).check(matches(isDisplayed()));
    }
}