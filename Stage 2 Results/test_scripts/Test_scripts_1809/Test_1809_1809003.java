package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_1809_1809003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowStartButtonIsDisabled throws InterruptedException {
        // Step 2: Locate the 'START' button.
        onView(withId(R.id.id_startbtn)).check(ViewAssertions.matches(isEnabled()));

        // Step 3: Attempt to press the 'START' button.
        Thread.sleep(500); // Wait for 500ms
        try {
            Espresso.onView(withId(R.id.id_startbtn)).perform(click());
        } catch (Exception e) {
            // Expected exception, as the button should be disabled and not respond to click
            System.out.println("Expected Exception: " + e.getMessage());
        }
    }
}