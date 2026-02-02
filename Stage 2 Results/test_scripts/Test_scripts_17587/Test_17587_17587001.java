package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17587_17587001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndNavigateToTheForYouSection() throws InterruptedException {
        // Step 1: Open the news app (Assuming it's already open, or this step is handled by setup)

        // Step 2: Tap on the 'For You' tab in the navigation bar
        Thread.sleep(500); // Wait for UI to stabilize after opening the app
        onView(withId(R.id.id_o3)).perform(click());

        // Expected Result: The 'For You' section should be displayed with curated content
        Thread.sleep(500); // Wait for the For You section to load
        onView(ViewMatchers.withContentDescription("For You")).check(matches(isDisplayed()));
    }
}