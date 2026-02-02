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

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_10863_10863009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserAttemptsToConnectAHealthRecord() throws InterruptedException {
        // Step 2: Navigate to the home page (Assuming home page is already loaded)
        
        // Step 3: Click on the 'Connect a health record' button in the recent activity section
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.id_listRecentActivity)).perform(click());
        Thread.sleep(500); // Wait for UI to stabilize
        
        // Expected Result: The user is prompted to connect a health record
        Espresso.onView(isDisplayed()).inRoot(isDialog()).check(ViewAssertions.matches(isDisplayed()));
    }
}