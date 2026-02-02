package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_14143_1414302 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserClicksOnStartYourFreeTrialButton() throws InterruptedException {
        // Step 1: Open the Lynda.com app (Assuming it's already open, or launch activity if needed)
        
        // Step 2: Navigate to the onboarding screen
        Espresso.onView(withId(R.id.onboarding_screen)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 3: Click on the 'Start your free trial' button
        Thread.sleep(500); // Wait for UI to stabilize
        Espresso.onView(withId(R.id.id_signup)).perform(ViewActions.click());

        // Expected Result: The user is redirected to the free trial sign-up screen
        Thread.sleep(500); // Wait for UI to stabilize
        Espresso.onView(withId(R.id.free_trial_sign_up_screen)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}