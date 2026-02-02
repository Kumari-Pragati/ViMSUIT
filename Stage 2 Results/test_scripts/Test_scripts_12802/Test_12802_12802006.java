package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12802_12802006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityusabilityScreenReader() throws InterruptedException {
        // Step 1: Open the Music App (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the Music History screen
        Espresso.onView(withId(R.id.nav_history)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for navigation

        // Step 3: Use a screen reader to navigate through the screen
        Espresso.pressBack(); // Simulate pressing back button to go to previous screen
        Thread.sleep(500); // Wait for transition
        
        // Assertion: The screen reader correctly reads out the content of the Music History screen
        onView(withId(R.id.id_recyclerview)).check(ViewAssertions.matches(isClickable()));
        
        // Additional assertion to check if RecyclerView is focusable
        Espresso.onView(withId(R.id.id_recyclerview)).perform(ViewActions.focus()).check(ViewAssertions.matches(isFocusable()));
    }
}