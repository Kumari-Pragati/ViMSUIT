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

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10183_10183006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowAppCrashesDuringCancellation() throws InterruptedException {
        // Step 1: Open the app (Assuming it's already open as per setup)
        
        // Step 2: Wait for the loading screen to appear
        Thread.sleep(500);
        
        // Step 3: Click on the 'Cancel' button
        onView(withId(R.id.id_login_view)).perform(ViewActions.click());
        
        // Step 4: Verify the message 'Please wait while we send you to your provider to log in...' is still displayed
        Thread.sleep(500);
        onView(withId(R.id.id_login_view)).check(ViewAssertions.matches(isDisplayed()));
        
        // Step 5: Click on the 'Cancel' button again
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_login_view)).perform(ViewActions.click());
        
        // Step 6: Verify the message 'Please wait while we send you to your provider to log in...' is still displayed
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_login_view)).check(ViewAssertions.matches(isDisplayed()));
        
        // Step 7: Wait for the app to redirect the user to the provider's login page (Assuming it doesn't crash)
        Thread.sleep(1000);
    }
}