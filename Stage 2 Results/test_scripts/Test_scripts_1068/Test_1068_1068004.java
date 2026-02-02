package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1068_1068004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewTheirLocation() throws InterruptedException {
        // Wait for the profile view to be displayed
        Thread.sleep(500);
        
        // Find the profile view and check if it is clickable and focusable
        onView(withId(R.id.id_profile)).check(matches(ViewMatchers.isDisplayed()));
        
        // Wait for 500ms before proceeding
        Thread.sleep(500);
        
        // Observe the location indicator showing 'San Francisco · 0 ft'
        Espresso.onView(withId(R.id.id_profile))
                .perform(ViewActions.click())
                .check(matches(withText("San Francisco · 0 ft")));
    }
}