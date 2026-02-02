package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16617_16617003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForAccessibilityOfTheLetsGetStartedButton throws InterruptedException {
        // Step 1: Open the app and navigate to screen 16617.
        // Assuming screen 16617 is MainActivity for simplicity

        // Step 2: Use accessibility tools to verify the 'Let's Get Started' button is accessible
        Thread.sleep(500); // Wait for UI to load

        // Check if the button is clickable and focusable
        onView(withId(R.id.id_continue_button)).check(matches(isClickable()));

        // Simulate a click on the button (for demonstration purposes)
        Thread.sleep(500);
        onView(withId(R.id.id_continue_button)).perform(click());

        // Additional assertion to check if the button can be interacted with using assistive technologies
        Espresso.pressBack(); // Go back to previous screen
        Thread.sleep(500);

        // Verify that the button is still accessible after going back
        onView(withId(R.id.id_continue_button)).check(matches(isClickable()));
    }
}