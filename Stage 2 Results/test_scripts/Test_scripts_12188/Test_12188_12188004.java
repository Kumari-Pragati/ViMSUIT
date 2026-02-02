package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12188_12188004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserClicksLetsGoButtonWithoutProvidingAnyInformation throws InterruptedException {
        // Step 1: Open the application (Assumed to be opened by ActivityTestRule)
        
        // Step 2: Navigate to the onboarding screen (Assuming it's already there or will be navigated automatically)
        
        // Step 3: Click on the 'Let's Go!' button
        onView(withId(R.id.id_fragment_onboarding_introduction_next_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The application should prompt the user to provide information.
        // The 'Let's Go!' button should be disabled until the user provides information.
        
        // Check if the button is clickable
        onView(withId(R.id.id_fragment_onboarding_introduction_next_button)).check(matches(not(isClickable())));
        
        // Optionally, you can check for a specific error message or dialog
        Espresso.onView(withText("Please provide some information")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}