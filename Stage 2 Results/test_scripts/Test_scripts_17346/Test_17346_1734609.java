package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_17346_1734609 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanAccessTheCurrentLocation() throws InterruptedException {
        // Step 1: Click on the current location 'Greensboro, NC'
        Thread.sleep(500);
        onView(withId(R.id.id_station_logo)).perform(ViewActions.click());

        // Expected Result: The user should be redirected to the current location's weather page
        Thread.sleep(500);
        Espresso.onView(withId(R.id.weather_page_container))
                .check(matches(isDisplayed()));

        // Additional assertion for the title or any other UI element if needed
    }
}