package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_16566_16566004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheManuallyButtonIsClickable() throws InterruptedException {
        // Step 1: Open the app and navigate to the home page.
        
        // Step 2: Click on the 'MANUALLY' button.
        Thread.sleep(500); // Wait for UI to load
        
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500); // Wait before verification

        // Step 3: Verify the button is clickable.
        onView(withContentDescription("['Navigate up']")).check(isClickable());
    }
}