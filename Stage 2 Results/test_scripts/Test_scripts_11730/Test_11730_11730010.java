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
public class Test_11730_11730010 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewTheTimeIcon() throws InterruptedException {
        // Observe the time icon at the top of the screen.
        Thread.sleep(500); // Wait for 500ms to ensure the UI is fully loaded

        // Use selector: onView(withId(R.id.id_vocabItemSaveVocab))
        onView(withId(R.id.id_vocabItemSaveVocab)).check(matches(isDisplayed()));

        // Add a sleep between interactions
        Thread.sleep(500); // Wait for 500ms before asserting the visibility of the time icon

        // Assert that the time icon is visible.
        Espresso.onView(ViewMatchers.isAssignableFrom(AppCompatImageView.class))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.FrameLayout.class)))
                .check(matches(isDisplayed()));
    }
}