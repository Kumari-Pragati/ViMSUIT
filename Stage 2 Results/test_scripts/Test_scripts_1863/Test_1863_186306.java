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
public class Test_1863_186306 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePlayButtonFunctionality() throws InterruptedException {
        // Wait for the UI to load and navigate to the screen with the 'play' button
        Thread.sleep(500);

        // Click on the 'play' button
        onView(withId(R.id.id_hintStartButton)).perform(click());

        // Wait for 500ms before checking the result
        Thread.sleep(500);

        // Assert that the app navigates to the 'play' screen
        onView(withText("play")).check(matches(isDisplayed()));
    }
}