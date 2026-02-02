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
public class Test_15194_15194002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySplashScreenTextInteraction() throws InterruptedException {
        // Wait for the splash screen to load
        Thread.sleep(500);

        // Tap on the 'Let's Get Started' button
        onView(withId(R.id.id_continue_button)).perform(click());

        // Wait for a moment before checking the next screen
        Thread.sleep(500);

        // Assert that the application has transitioned to the next screen
        onView(withText("Next Screen Title")).check(matches(isDisplayed()));
    }
}