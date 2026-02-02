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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_11658_11658004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySubscriptionDetails() throws InterruptedException {
        // Step 1: Open the Dcoder app (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the Subscription Options screen
        onView(withContentDescription("Navigate up")).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Click on the 'Monthly Subscription (Dcoder, Mobile Compiler IDE)' option
        onView(allOf(withText("Monthly Subscription (Dcoder, Mobile Compiler IDE)"), withContentDescription("Navigate up"))).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Verify that the subscription details are displayed correctly
        onView(withText("Subscription Details")).check(matches(isDisplayed()));
        
        // Additional assertions can be added here based on expected content
    }
}