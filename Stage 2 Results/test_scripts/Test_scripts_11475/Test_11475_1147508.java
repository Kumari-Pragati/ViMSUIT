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
public class Test_11475_1147508 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnANailDesignImageInTheGrid() throws InterruptedException {
        // Step 1: Open the Nail Art App (Assuming it's already open, or this step is handled by setup)

        // Step 2: Tap on a nail design image in the grid
        Thread.sleep(500); // Wait for UI to load

        onView(withId(R.id.id_recyclerView)).perform(ViewActions.click());

        Thread.sleep(500); // Wait before checking the result

        // Expected Result: The app should display a detailed view of the selected nail design
        onView(withId(R.id.detailView)).check(matches(isDisplayed()));
    }
}