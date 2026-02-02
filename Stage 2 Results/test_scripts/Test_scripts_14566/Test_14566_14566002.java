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

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.not;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_14566_14566002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testNegativeFlowAttemptingToNavigateToANonexistentTab throws InterruptedException {
        // Open the CW Seed app (initialization is done by ActivityTestRule)

        // Tap on the 'INFO' tab
        Espresso.onView(withId(R.id.tabLayout)).performClick();
        Thread.sleep(500);

        // Attempt to tap on a non-existent tab
        Espresso.onView(withContentDescription("[None]")).check(ViewAssertions.matches(not(isClickable()))).perform(click());
        Thread.sleep(500);

        // Assert that the app does not navigate to a non-existent tab
        Espresso.onView(withId(R.id.tabLayout)).check(ViewAssertions.matches(not(hasFocus()))); // Assuming the focus should not change if navigation fails
    }
}