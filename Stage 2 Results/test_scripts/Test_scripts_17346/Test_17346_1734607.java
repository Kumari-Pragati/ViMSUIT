package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_17346_1734607 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanSearchForADifferentLocation() throws InterruptedException {
        // Step 1: Click on the search bar and enter a new location.
        onView(withId(R.id.id_station_logo)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        Espresso.onView(ViewMatchers.withText("Enter Location")).check(matches(ViewMatchers.isDisplayed()));
        
        // Assuming the search bar is now active, type in a new location
        onView(withText("Enter Location")).perform(ViewActions.typeText("New York"), ViewActions.closeSoftKeyboard());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Verify that the search results are displayed
        Espresso.onView(withId(R.id.search_results)).check(matches(ViewMatchers.isDisplayed()));
    }
}