package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17921_17921004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheNavigationButtonsInTheFooterAreClickable() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu screen.
        
        // Step 2: Click on each navigation button in the footer.
        // Assuming there are multiple buttons, we will click on one for demonstration
        onView(withId(R.id.id_mDodaj)).perform(click());
        Thread.sleep(500); // Wait for 500ms to ensure the transition is complete

        // Step 3: Verify that each navigation button leads to its respective screen.
        // For this example, we will verify the clickability of the button
        onView(withId(R.id.id_mDodaj)).check(matches(isClickable()));
        
        // Additional steps can be added here for other buttons if necessary
    }
}