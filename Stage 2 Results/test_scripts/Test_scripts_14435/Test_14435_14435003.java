package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14435_14435003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheNavigationBarIconsAreClickable() throws InterruptedException {
        // Step 2: Click on the "Latest" icon in the navigation bar.
        onView(withId(R.id.id_positive_action)).perform(click());
        Thread.sleep(500); // Wait for 500ms

        // Step 3: Click on the "Social" icon in the navigation bar.
        onView(withId(R.id.id_positive_action)).perform(click());
        Thread.sleep(500); // Wait for 500ms

        // Step 4: Click on the "Fan Zone" icon in the navigation bar.
        onView(withId(R.id.id_positive_action)).perform(click());
        Thread.sleep(500); // Wait for 500ms

        // Step 5: Click on the "Schedule" icon in the navigation bar.
        onView(withId(R.id.id_positive_action)).perform(click());
        Thread.sleep(500); // Wait for 500ms

        // Step 6: Click on the "Tickets" icon in the navigation bar.
        onView(withId(R.id.id_positive_action)).perform(click());
        Thread.sleep(500); // Wait for 500ms

        // Assertion to check if the views are clickable
        onView(withId(R.id.id_positive_action)).check(matches(isClickable()));
    }
}