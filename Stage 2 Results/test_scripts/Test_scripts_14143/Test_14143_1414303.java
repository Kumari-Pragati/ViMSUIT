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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14143_1414303 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUiTestVerifyTheAlreadyAMemberButtonIsClickable() throws InterruptedException {
        // Step 2: Navigate to the onboarding screen (assuming it's already there)
        
        // Step 3: Click on the 'Already a member?' button
        Thread.sleep(500); // Wait for UI to stabilize
        
        onView(withId(R.id.id_login)).perform(click());
        
        // Expected result: The 'Already a member?' button is responsive and navigates to the login screen.
        Thread.sleep(500); // Wait for navigation to complete

        // Assert that the button was clickable
        onView(withId(R.id.id_login)).check(matches(isClickable()));
    }
}