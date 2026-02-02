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
public class Test_10522_1052205 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheTextTool throws InterruptedException {
        // Click on the text tool
        onView(withId(R.id.id_textSizeBt)).perform(click());
        
        // Wait for 500ms to ensure the UI updates
        Thread.sleep(500);
        
        // Assert that the text tool is active
        onView(withId(R.id.id_textSizeBt)).check(matches(isClickable()));
    }
}