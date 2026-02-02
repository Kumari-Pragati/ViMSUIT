package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_12952_12952006 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityTestSkipAllButton throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        
        // Step 2: Verify the 'Skip All' button is accessible and can be clicked.
        Thread.sleep(500); // Wait for the UI to load
        
        onView(withContentDescription("['Navigate up']")).check(matches(isClickable()));
        Thread.sleep(500);
        
        onView(withContentDescription("['Navigate up']")).perform(click());
    }
}