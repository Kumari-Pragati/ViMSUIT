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
public class Test_1809_1809005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowStartButtonIsNotClickable() throws InterruptedException {
        // Open the app (already done by ActivityTestRule)

        // Locate the 'START' button
        onView(withId(R.id.id_startbtn)).check(ViewAssertions.matches(isClickable(false)));

        // Attempt to press the 'START' button
        Thread.sleep(500);
        try {
            Espresso.onView(withId(R.id.id_startbtn)).perform(null); // This should fail due to non-clickability
        } catch (Exception e) {
            // Expected exception, as the button is not clickable
            System.out.println("Expected exception caught: " + e.getMessage());
        }

        Thread.sleep(500);
    }
}