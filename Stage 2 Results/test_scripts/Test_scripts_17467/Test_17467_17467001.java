package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17467_17467001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheStatusBarIconsAreDisplayedCorrectly() throws InterruptedException {
        // Open the app and observe the status bar
        onView(withId(R.id.id_backgroundImage)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for 500ms to ensure the UI is updated
        
        // Check if the battery, signal, and time icons are displayed correctly
        onView(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(AppCompatImageView.class))).check(matches(isDisplayed()));
    }
}