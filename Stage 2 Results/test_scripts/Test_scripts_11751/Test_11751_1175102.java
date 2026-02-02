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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_11751_1175102 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateBackToThePreviousScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Bus Routes' screen.
        // Assuming that navigating to the Bus Routes screen is done through some action in MainActivity

        // Step 2: Tap the back arrow in the header to navigate back to the previous screen
        Thread.sleep(500); // Wait for UI to stabilize after opening the app
        onView(withContentDescription("Navigate up")).perform(click());

        // Expected Result: The app navigates back to the previous screen successfully.
        Thread.sleep(500); // Wait for navigation animation to complete

        // Assert that we are on the expected screen (e.g., Home Screen)
        onView(isDisplayed()).check(matches(withContentDescription("Home")));
    }
}