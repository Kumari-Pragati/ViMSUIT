package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11730_11730002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testUserCanPlayTheAudioForThePhraseCommentVastu() throws InterruptedException {
        // Step 1: Click on the play button.
        onView(withId(R.id.id_button_play_entity)).perform(click());
        
        // Wait for 500ms to ensure the audio starts playing
        Thread.sleep(500);
        
        // Assert that the play button is no longer clickable after clicking it
        onView(withId(R.id.id_button_play_entity)).check(matches(isClickable(false)));
    }
}