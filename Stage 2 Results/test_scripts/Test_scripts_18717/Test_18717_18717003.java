package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_18717_18717003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheRunButton() throws InterruptedException {
        // Click on the 'Run' button at the bottom of the screen.
        onView(withId(R.id.id_btnAutoTest)).perform(click());
        
        // Wait for 500ms to allow the algorithm to execute.
        Thread.sleep(500);
        
        // Assert that the Bubble Sort algorithm has been executed and the array is sorted.
        // This assertion should be replaced with actual checks based on your UI or data changes.
        onView(withText("Array Sorted")).check(matches(isDisplayed()));
    }
}