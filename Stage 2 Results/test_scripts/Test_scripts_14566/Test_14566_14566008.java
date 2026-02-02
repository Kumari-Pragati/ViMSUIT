package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.widget.ImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_14566_14566008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowAttemptingToInteractWithTheCwSeedLogo throws InterruptedException {
        // Open the CW Seed app (Assuming MainActivity is launched by default)
        
        // Attempt to interact with the CW Seed logo using the 'Navigate up' button selector
        Thread.sleep(500); // Wait for 500ms before proceeding
        
        // Check if interaction with the CW Seed logo is not allowed
        onView(withContentDescription("['Navigate up']"))
                .check(ViewAssertions.doesNotExist());
        
        Thread.sleep(500); // Wait for 500ms between interactions
    }
}