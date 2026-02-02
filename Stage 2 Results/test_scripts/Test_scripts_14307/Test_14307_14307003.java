package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14307_14307003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheScreenIsAccessibleAndUsable() throws InterruptedException {
        // Navigate to the screen with ID 14307 (assuming it's the main activity)
        
        // Test element 1: title bar back button
        onView(withId(R.id.id_title_bar_back_button)).perform(click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Verify state of element 1
        onView(withId(R.id.id_title_bar_back_button)).check(matches(isClickable()));

        // Test element 2: current list view
        onView(withId(R.id.id_current_list_view)).perform(click());
        Thread.sleep(500);
        
        // Verify state of element 2
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withId(R.id.id_current_list_view)).check(matches(isClickable()));
    }
}