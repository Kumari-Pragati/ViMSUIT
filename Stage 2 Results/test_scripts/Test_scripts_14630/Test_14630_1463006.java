package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ImageView;

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
public class Test_14630_1463006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheRefreshIconIsFunctional() throws InterruptedException {
        // Wait for the view to be clickable and then click it
        onView(withId(R.id.id_imageView13)).check(matches(isClickable()));
        Thread.sleep(500); // Sleep for 500ms to ensure the view is fully interactable

        onView(withId(R.id.id_imageView13)).perform(click());
        Thread.sleep(500); // Sleep for 500ms after clicking to allow time for refresh action

        // Assuming that a successful refresh will change some state or show a loading indicator
        // Here we assert that the view is no longer clickable, indicating it's processing the request
        onView(withId(R.id.id_imageView13)).check(matches(not(isClickable())));
    }
}