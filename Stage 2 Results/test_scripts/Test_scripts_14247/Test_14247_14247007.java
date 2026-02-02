package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_14247_14247007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateBackToThePreviousScreen() throws InterruptedException {
        // Step 1: Open the app (Assuming MainActivity is launched by default)
        
        // Step 2: Navigate back to the previous screen
        Thread.sleep(500); // Wait for UI to stabilize
        
        onView(withContentDescription("More options")).perform(click());
        Thread.sleep(500); // Wait for UI transition

        // Step 3: Verify the previous screen is displayed
        Espresso.pressBack();
        Thread.sleep(500); // Wait for UI transition

        // Check if the expected view is displayed on the previous screen
        onView(withContentDescription("More options")).check(ViewAssertions.matches(isDisplayed()));
    }
}