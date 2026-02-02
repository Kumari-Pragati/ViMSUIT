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
public class Test_12393_1239304 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyTaskInput() throws InterruptedException {
        // Open the application (initially done by ActivityTestRule)
        
        // Tap on the 'MY TASK LIST' tab
        Espresso.onView(withId(R.id.my_task_list_tab)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Tap on the yellow circular button with a plus sign at the bottom right
        Espresso.onView(withId(R.id.id_add_task)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Enter an empty task name (no input needed as it's already empty)
        
        // Tap on the 'Add' button
        Espresso.onView(withId(R.id.id_add_task)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Assert that no new task is added to the 'MY TASK LIST' tab
        Espresso.onView(withId(R.id.task_list_view)).check(ViewAssertions.doesNotExist());
    }
}