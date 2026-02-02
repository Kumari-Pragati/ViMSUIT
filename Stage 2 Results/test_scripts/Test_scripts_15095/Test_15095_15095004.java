package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_15095_15095004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testVerifyThatTheScreenDisplaysTheCorrectStatusBarIcons() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Watchlist' page.
        onView(withId(R.id.id_body_scrollView)).perform(click());
        
        // Step 2: Verify that the status bar displays the correct icons
        Thread.sleep(500); // Wait for UI updates
        
        // Check if signal strength icon is displayed
        onView(allOf(isDisplayed(), withId(android.R.id.signal))).check(matches(isDisplayed()));
        
        // Check if battery icon is displayed
        onView(allOf(isDisplayed(), withId(android.R.id.battery))).check(matches(isDisplayed()));
        
        // Check if time (7:57) is displayed in the status bar
        Thread.sleep(500); // Wait for UI updates
        Espresso.pressBack(); // Go back to home screen to check time icon
        
        onView(allOf(isDisplayed(), withId(android.R.id.statusBarIcon))).perform(ViewActions.swipeUp());
        
        String expectedTime = "7:57";
        Thread.sleep(500); // Wait for UI updates
        Espresso.pressBack(); // Go back to home screen to check time icon
        
        onView(allOf(isDisplayed(), withId(android.R.id.statusBarIcon))).check(matches(ViewAssertions.matches(
                hasDescendant(withText(expectedTime)))));
    }
}