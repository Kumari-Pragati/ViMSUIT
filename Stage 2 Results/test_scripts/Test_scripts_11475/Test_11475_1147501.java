package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11475_1147501 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndNavigateToTheIdeasTab throws InterruptedException {
        // Step 1: Open the Nail Art App (Assumed to be done by the rule)
        
        // Step 2: Tap on the 'ИДЕИ' (Ideas) tab at the bottom of the screen
        Thread.sleep(500); // Wait for UI to stabilize after activity launch
        onView(withId(R.id.id_tabs)).perform(ViewActions.click());
        Thread.sleep(500); // Wait before assertion

        // Expected Result: The screen should display a grid of nail design images
        onView(withId(R.id.id_recycler_view)).check(matches(isDisplayed()));
    }
}