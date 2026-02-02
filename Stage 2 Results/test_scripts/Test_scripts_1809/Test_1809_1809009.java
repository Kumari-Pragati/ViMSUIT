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
public class Test_1809_1809009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowStartButtonIsNotPersistent throws InterruptedException {
        // Step 2: Locate the 'START' button
        onView(withId(R.id.id_startbtn)).check(ViewAssertions.matches(isDisplayed()));

        // Step 3: Attempt to press the 'START' button
        Thread.sleep(500); // Wait for 500ms before interacting with the view

        Espresso.onView(withId(R.id.id_startbtn)).perform(null);
        Thread.sleep(500); // Wait for 500ms after attempting interaction

        // Expected result: The 'START' button should be persistent
        onView(withId(R.id.id_startbtn)).check(ViewAssertions.matches(isDisplayed()));
    }
}