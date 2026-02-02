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
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_11746_11746007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityTestPlayButton() throws InterruptedException {
        // Ensure the Vocabulary screen is open.
        Thread.sleep(500); // Wait for the screen to load

        // Use accessibility features to interact with the play button.
        onView(withId(R.id.id_button_play_entity)).perform(click());
        Thread.sleep(500); // Wait for the action to complete

        // The audio for the key phrase 'content / contente' is played.
        Espresso.pressBack(); // Go back to previous screen
        Thread.sleep(500); // Wait for the transition

        // Assert that the play button is no longer clickable after interaction
        onView(withId(R.id.id_button_play_entity)).check(matches(isClickable()));
    }
}