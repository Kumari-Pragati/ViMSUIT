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
public class Test_1753_1753006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheGetStartButtonIsAccessible() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 1: Navigate to screen 1753 (assuming this step is handled by the app flow)
        
        // Step 2: Use accessibility tools to verify that the 'GET START' button is accessible
        onView(withId(R.id.id_help_instruction_nextButton)).check(ViewAssertions.matches(isClickable()));

        // Thread.sleep(500) to ensure the UI is fully loaded before proceeding
        Thread.sleep(500);
    }
}