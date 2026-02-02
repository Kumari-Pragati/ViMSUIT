package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_16617_16617001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTheLetsGetStartedButton() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Verify the presence of the 'Let's Get Started' button
        onView(withId(R.id.id_continue_button)).check(ViewAssertions.matches(isDisplayed()));

        // Wait before proceeding (optional, can be removed if not needed)
        Thread.sleep(500);
    }
}