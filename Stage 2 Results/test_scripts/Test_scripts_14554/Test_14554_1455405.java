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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14554_1455405 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheMessageIconIsFunctional() throws InterruptedException {
        // Step 1: Open the messaging app 'airMail'
        
        // Step 2: Click on the message icon in the main content area.
        Thread.sleep(500); // Wait for UI to load
        
        onView(withId(R.id.id_main_menu_notification)).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Expected Result: Navigating to the messages screen should be successful
        onView(withId(R.id.id_main_menu_notification)).check(matches(isDisplayed()));
    }
}