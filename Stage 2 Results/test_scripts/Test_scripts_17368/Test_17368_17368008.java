package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

@RunWith(JUnit4.class)
public class Test_17368_17368008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testCheckUsabilityOfTheScreen() throws InterruptedException {
        // Step 1: Open the mobile app (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the Eggless Desserts screen
        onView(allOf(ViewMatchers.withId(R.id.nav_egglessDesserts))).perform(click());
        Thread.sleep(500); // Wait for navigation
        
        // Step 3: Verify that the screen is easy to navigate and understand
        // Check if RecyclerView is focusable but not clickable (as per testability score)
        onView(withContentDescription("[None]")).check(matches(isClickable(false)));
        
        // Additional checks can be added here based on specific UI elements or actions
    }
}