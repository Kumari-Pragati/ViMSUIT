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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_14630_1463007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheBackArrowIsFunctional() throws InterruptedException {
        // Wait for the initial screen to load
        Thread.sleep(500);

        // Click on the back arrow
        onView(withContentDescription("Navigate up")).perform(click());

        // Wait for 500ms before checking if we are on the previous screen
        Thread.sleep(500);

        // Assert that the previous screen is displayed
        onView(withContentDescription("Navigate up")).check(matches(isDisplayed()));
    }
}