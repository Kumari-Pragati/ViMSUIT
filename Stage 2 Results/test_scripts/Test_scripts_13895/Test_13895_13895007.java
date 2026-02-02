package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ImageView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_13895_13895007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(20000); // 20 seconds

    @Test
    public void testUsabilityTestNavigation() throws InterruptedException {
        // Step 1: Open the app and navigate to the gallery screen.
        // Assuming that the gallery screen is already open or can be navigated to directly.

        // Step 2: Tap on the back arrow button in the top left corner.
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withContentDescription("[None]")).perform(click());

        // Expected Result: The user is navigated back to the previous screen.
        Thread.sleep(500); // Wait for navigation animation
        onView(withContentDescription("[None]")).check(matches(isDisplayed())); // Check if the back arrow button is still displayed

        Espresso.pressBack(); // Pressing back again to ensure we are on the correct screen
    }
}