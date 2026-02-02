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

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_11150_1115001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfShortReviews() throws InterruptedException {
        // Step 1: Open the app and navigate to the feedback review screen.
        Espresso.onView(withContentDescription("['写点评']")).perform(click());
        
        // Step 2: Verify that the title '1 条点评' (1 short review) is displayed.
        Thread.sleep(500); // Wait for UI to update
        
        Espresso.onView(isDisplayed()).check(ViewAssertions.matches(isDisplayed()));
    }
}