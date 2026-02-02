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
public class Test_11150_1115007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheAbsenceOfLongReviews() throws InterruptedException {
        // Step 1: Open the app and navigate to the feedback review screen.
        Espresso.onView(withContentDescription("['写点评']")).perform(click());
        
        // Step 2: Click on the subtitle '0 条长评' (0 long reviews).
        Thread.sleep(500);
        
        // Step 3: Verify that no long reviews are displayed.
        Espresso.onView(isDisplayed()).check(ViewAssertions.matches(not(isDisplayed())));
    }
}