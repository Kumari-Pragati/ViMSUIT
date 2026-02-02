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

import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11082_1108209 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testLoginWithFacebookBoundaryvalidation() throws InterruptedException {
        // Step 1: Open the Ticketpop app (Assumed to be done by ActivityTestRule)
        
        // Step 2: Click on the 'Login with Facebook' button
        Thread.sleep(500);
        onView(withId(R.id.id_btn_login)).perform(ViewActions.click());

        // Step 3: Ensure the Facebook login process is successful
        Thread.sleep(500);
        Espresso.onView(withId(R.id.main_screen_element_id)) // Replace with actual main screen element ID
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}