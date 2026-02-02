package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;

@RunWith(JUnit4.class)
public class Test_14566_14566006 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowAttemptingToInteractWithTheAppVersion() throws InterruptedException {
        // Step 1: Open the CW Seed app (Assuming MainActivity is launched by default)
        
        // Step 2: Tap on the 'INFO' tab
        onView(withContentDescription("INFO")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Attempt to interact with the app version (v1.1.260)
        // Note: The actual interaction is not allowed, so we assert that it should be non-clickable
        onView(withId(R.id.list)).check(matches(not(isClickable())));
        
        // Additional assertion to ensure no other interactions are possible
        Thread.sleep(500); // Wait for UI to stabilize
        Espresso.closeSoftKeyboard(); // Close soft keyboard if open
        
        // Final check: Ensure the app version cannot be interacted with
        onView(withContentDescription("[None]")).check(matches(not(isClickable())));
    }
}