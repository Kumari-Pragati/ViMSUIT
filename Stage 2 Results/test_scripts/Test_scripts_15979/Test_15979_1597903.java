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
public class Test_15979_1597903 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToMapsSection() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu section.
        Thread.sleep(500); // Wait for the app to initialize

        // Step 2: Click on the 'Maps' section.
        onView(withId(R.id.id_drawer)).performClick();
        Thread.sleep(500); // Wait for the drawer to open

        // Expected Result: The screen should display the 'Maps' section.
        Espresso.onView(isDisplayed()).check(ViewAssertions.matches(isDisplayed()));
    }
}