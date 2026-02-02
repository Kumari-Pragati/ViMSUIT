package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14630_1463008 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheGridOfCatImagesIsClickable() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Click on one of the cat images in the grid
        onView(withId(R.id.id_imageView13)).perform(click());

        // Wait for the new screen to load
        Thread.sleep(500);

        // Verify that the detailed view is displayed
        onView(withId(R.id.detail_view_container)).check(matches(isDisplayed()));
    }
}