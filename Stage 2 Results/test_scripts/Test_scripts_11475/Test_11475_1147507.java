package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11475_1147507 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnANavigationTab throws InterruptedException {
        // Step 1: Open the Nail Art App (Assumed to be done by the rule)

        // Step 2: Tap on a navigation tab
        Thread.sleep(500); // Wait for UI to stabilize

        onView(withId(R.id.id_tabs)).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Step 3: Assert that the screen navigates to the selected tab
        Espresso.onView(ViewMatchers.withText("ИДЕИ")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}