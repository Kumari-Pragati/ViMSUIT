package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_12393_1239301 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowViewTasksInMyTaskListTab() throws InterruptedException {
        // Step 1: Open the application (Assuming it's already open, or launch it if needed)
        
        // Step 2: Tap on the 'MY TASK LIST' tab
        onView(withId(R.id.id_viewpager)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Verify that the task 'Get groceries' is displayed
        onView(withText("Get groceries")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}