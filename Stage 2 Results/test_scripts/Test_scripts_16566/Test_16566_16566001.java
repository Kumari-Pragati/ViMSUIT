package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_16566_16566001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheWelcomeMessageAndSubtitleAreDisplayedCorrectly() throws InterruptedException {
        // Open the app and navigate to the home page.
        Thread.sleep(500); // Wait for 500ms

        // Verify the 'WELCOME' message is displayed.
        onView(allOf(withId(R.id.id_drawer_layout), withText("WELCOME"))).check(matches(isDisplayed()));

        // Verify the subtitle 'ADD BOOKS TO YOUR LIBRARY EASILY' is displayed.
        Thread.sleep(500); // Wait for 500ms
        Espresso.onView(withText("ADD BOOKS TO YOUR LIBRARY EASILY")).check(matches(isDisplayed()));
    }
}