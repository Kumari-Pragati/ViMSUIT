package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Test_14435_14435005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheContinueButtonIsUsable() throws InterruptedException {
        // Step 1: Open the Cleveland Browns mobile app (already covered by ActivityTestRule)

        // Step 2: Click on the "Continue" button with a finger
        Thread.sleep(500);
        onView(withId(R.id.id_positive_action)).perform(click());
        
        // Step 3: Click on the "Continue" button with a stylus
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_positive_action)).perform(click());

        // Expected Result: The user is successfully navigated to the next screen when clicking on the "Continue" button.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Next Screen Title")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}