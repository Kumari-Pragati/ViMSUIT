package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.is;

@RunWith(AndroidJUnit4.class)
public class Test_13895_13895008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestNavigation() throws InterruptedException {
        // Navigate to the gallery screen (assuming it's the initial screen)
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for 500ms

        // Tap on the back arrow button in the top left corner
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.click());

        Thread.sleep(500); // Wait for 500ms

        // Assert that we are navigated back to the previous screen (gallery screen)
        // Assuming the gallery screen has a specific view or text that can be used as an assertion
        Espresso.onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}