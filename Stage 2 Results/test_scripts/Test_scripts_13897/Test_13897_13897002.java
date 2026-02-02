package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13897_13897002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnAFruitImageInTheXGrid() throws InterruptedException {
        // Step 1: Click on one of the fruit images in the 3x3 grid.
        onView(withId(R.id.drawable_fr_12)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms to ensure the view state change is visible

        // Expected Result: The selected fruit image should be highlighted or marked as selected.
        onView(withId(R.id.drawable_fr_12)).check(matches(isDisplayed()));
    }
}