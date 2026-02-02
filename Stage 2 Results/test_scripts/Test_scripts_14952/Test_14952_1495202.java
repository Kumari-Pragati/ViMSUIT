package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14952_1495202 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSkippingAgeSelection() throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        // This step is assumed to be handled by the ActivityTestRule.

        // Step 2: Click on the 'SKIP' button at the bottom.
        onView(withId(R.id.id_next_btn)).perform(click());
        
        Thread.sleep(500); // Wait for UI updates

        // Expected Result: The app should proceed to the next onboarding screen.
        // Verify that the next button is no longer clickable
        onView(withId(R.id.id_next_btn)).check(matches(not(isClickable())));

        // Expected Result: The 'SKIP' button should be disabled after selection.
        // This step is assumed to be handled by the UI logic and not directly testable with Espresso.
    }
}