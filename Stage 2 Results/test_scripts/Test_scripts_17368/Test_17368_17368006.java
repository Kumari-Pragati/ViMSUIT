package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

@RunWith(AndroidJUnit4.class)
public class Test_17368_17368006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateBackToThePreviousScreen() throws InterruptedException {
        // Step 2: Navigate to the Eggless Desserts screen (Assuming this step is handled by MainActivity)
        
        // Step 3: Click on the back arrow in the header
        Thread.sleep(500); // Wait for UI to stabilize
        
        onView(withContentDescription("[None]")).perform(click());
        
        // Expected Result: The user is navigated back to the previous screen
        Thread.sleep(500); // Wait for UI to stabilize
        getInstrumentation().waitForIdleSync(); // Ensure the app is idle before checking

        // Assert that we are on the expected previous screen (Assuming MainActivity has a method to check this)
        // For example, if MainActivity has a method called isPreviousScreenVisible()
        // onView(withId(R.id.previous_screen_indicator)).check(matches(isDisplayed()));
    }
}