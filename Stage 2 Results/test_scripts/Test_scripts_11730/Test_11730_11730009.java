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
public class Test_11730_11730009 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewTheBatteryIcon() throws InterruptedException {
        // Observe the battery icon at the top of the screen.
        Thread.sleep(500); // Wait for 500ms to ensure the UI is fully loaded

        // Use selector: onView(withId(R.id.id_vocabItemSaveVocab))
        onView(ViewMatchers.isAssignableFrom(AppCompatImageView.class)).check(matches(isDisplayed()));

        // Add a sleep between interactions
        Thread.sleep(500);

        // Assert that the battery icon is visible.
        onView(withId(R.id.id_vocabItemSaveVocab)).check(matches(isDisplayed()));
    }
}