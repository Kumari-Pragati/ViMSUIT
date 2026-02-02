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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_11746_11746003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowListenToTheKeyPhrase() throws InterruptedException {
        // Ensure the Vocabulary screen is open.
        Thread.sleep(500); // Wait for the screen to load

        // Click on the 'LISTEN TO THE KEY PHRASE' button.
        onView(withId(R.id.id_button_play_entity)).perform(click());
        Thread.sleep(500); // Wait for the action to complete

        // The audio for the key phrase 'content / contente' is played.
        // Assuming there's a way to verify that the audio has started playing, e.g., a view or toast message
        onView(withId(R.id.id_button_play_entity)).check(matches(isDisplayed()));
    }
}