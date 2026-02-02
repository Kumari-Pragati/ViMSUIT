package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_15123_1512305 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheWelcomeScreenIsUsable() throws InterruptedException {
        // Step 1: Open the Forever 21 mobile app (Assuming it's already opened)
        
        // Step 2: Verify the welcome screen is easy to navigate and understand
        Thread.sleep(500); // Wait for the view to be fully loaded

        // Check if the ViewPager is displayed
        onView(withId(R.id.id_vPOnboardingImages)).check(matches(isDisplayed()));

        // Check if the ViewPager is focusable (indicating it's interactive)
        onView(withId(R.id.id_vPOnboardingImages)).check(matches(ViewMatchers.isFocusable()));

        // Simulate a click on the ViewPager to navigate through the welcome screen
        Thread.sleep(500);
        onView(withId(R.id.id_vPOnboardingImages)).perform(click());

        // Wait for the next view in the ViewPager to be displayed
        Thread.sleep(500);

        // Check if the next view is also displayed and focusable
        onView(withId(R.id.id_vPOnboardingImages)).check(matches(isDisplayed()));
        onView(withId(R.id.id_vPOnboardingImages)).check(matches(ViewMatchers.isFocusable()));

        // Additional assertions can be added based on specific UI elements or actions

        // End of test case
    }
}