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
public class Test_1809_1809008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowStartButtonIsNotResponsive() throws InterruptedException {
        // Step 2: Locate the 'START' button
        onView(withId(R.id.id_startbtn)).check(ViewAssertions.matches(isClickable()));

        // Step 3: Attempt to press the 'START' button
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_startbtn)).perform(null);

        // Expected result: The 'START' button should be responsive
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_startbtn)).check(ViewAssertions.matches(isClickable()));
    }
}