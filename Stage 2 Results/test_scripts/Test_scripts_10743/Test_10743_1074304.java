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
public class Test_10743_1074304 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserSkipsTheGetConnectedScreen() throws InterruptedException {
        // Wait for the UI to load and stabilize
        Thread.sleep(500);

        // Step 1: Open the fitness app (already covered by ActivityTestRule)

        // Step 2: Click on the 'SKIP AND FINISH SIGN UP' button
        onView(withId(R.id.id_finish_sign_up)).perform(click());

        // Wait for the UI to stabilize after interaction
        Thread.sleep(500);

        // Expected Result: The user is directed to the sign-up completion screen
        onView(withText("Sign-Up Completion Screen Text")).check(matches(isDisplayed()));
    }
}