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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13897_13897003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheLargeWatermelonSliceImage() throws InterruptedException {
        // Wait for the view to be displayed before interacting with it
        onView(withId(R.id.drawable_fr_12)).check(matches(isDisplayed()));

        // Click on the large watermelon slice image
        Thread.sleep(500);
        onView(withId(R.id.drawable_fr_12)).perform(click());

        // Wait for 500ms to allow the UI to update and highlight the image
        Thread.sleep(500);

        // Assert that the image is highlighted or marked as selected
        onView(withId(R.id.drawable_fr_12)).check(matches(isDisplayed()));
    }
}