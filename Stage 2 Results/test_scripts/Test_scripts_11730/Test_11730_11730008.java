package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_11730_11730008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewTheSignalStrengthIcon() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it.
        Thread.sleep(500);

        // Observe the signal strength icon at the top of the screen.
        onView(withId(R.id.id_vocabItemSaveVocab)).check(matches(isDisplayed()));

        // Additional assertion for the class type if needed
        onView(withId(R.id.id_vocabItemSaveVocab)).perform(ViewActions.click());
        Thread.sleep(500); // Wait to ensure the view is interacted with properly

        // Ensure that the clicked view is an instance of AppCompatImageView
        Espresso.onData(ViewMatchers.instanceOf(AppCompatImageView.class))
                .inAdapterView(withId(R.id.id_vocabItemSaveVocab))
                .perform(ViewActions.click());
        Thread.sleep(500); // Wait to ensure the view is interacted with properly

        // Additional assertions can be added here if necessary
    }
}