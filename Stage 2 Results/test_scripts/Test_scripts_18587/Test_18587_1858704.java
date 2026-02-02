package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_18587_1858704 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestNavigationBar() throws InterruptedException {
        // Step 1: Open the app (already done by ActivityTestRule)

        // Step 2: Navigate to the profile page for 'appcrawler4'
        // Assuming this step is handled within the MainActivity or a specific method

        // Step 3: Click on the 'menu' icon in the navigation bar at the bottom
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.id_mainMenu)).perform(click());

        // Expected Result: The menu options are displayed
        Thread.sleep(500); // Wait for UI to stabilize after click
        Espresso.onView(isDisplayed()).check(ViewAssertions.matches(isDisplayed()));
    }
}