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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_15677_15677004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000);

    @Test
    public void testVerifyNavigationBackToPreviousScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the Help & Contact screen.
        // Assuming that the Help & Contact screen is already open or can be navigated to from MainActivity

        // Step 2: Click on the back arrow in the header
        Thread.sleep(500);
        onView(withContentDescription("Navigate up")).perform(click());

        // Step 3: Verify that the user is navigated back to the previous screen
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(matches(ViewAssertions.matches(ViewMatchers.isRoot())));

        // Additional assertion to check if we are on the expected screen
        // Assuming there is a specific view or text in the previous screen that can be checked
        // For example, checking for a title or a button
        Thread.sleep(500);
        Espresso.onView(withContentDescription("Navigate up")).check(matches(isDisplayed()));
    }
}