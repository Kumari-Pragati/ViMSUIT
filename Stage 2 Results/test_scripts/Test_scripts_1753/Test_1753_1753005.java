package com.example.tests;

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
public class Test_1753_1753005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheGetStartButtonIsClickable() throws InterruptedException {
        // Step 1: Open the app and navigate to screen 1753 (Assuming it's already on the correct screen)
        
        // Step 2: Click on the 'GET START' button
        Thread.sleep(500);
        onView(withId(R.id.id_help_instruction_nextButton)).perform(click());

        // Step 3: Verify that the app navigates to the next screen (Assuming there is a specific view or action in the next screen)
        Thread.sleep(500);
        onView(withId(R.id.next_screen_id)).check(matches(isClickable()));
    }
}