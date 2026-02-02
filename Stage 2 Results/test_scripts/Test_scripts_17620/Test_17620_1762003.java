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

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_17620_1762003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyIfTheScreenIsAccessible throws InterruptedException {
        // Step 1: Open the NextRadio app (assumed to be done by the rule)
        
        // Step 2: Navigate to the screen displaying the informational message about FM radio unavailability
        // This step is assumed as part of the application flow and not explicitly coded here.
        
        // Step 3: Perform accessibility checks on the screen
        Thread.sleep(500); // Wait for UI to stabilize
        
        // Check if the image view is clickable, which should be true based on testability score
        onView(withId(R.id.id_imageView1)).check(ViewAssertions.matches(isClickable()));
        
        // Additional checks can be added here as needed
    }
}