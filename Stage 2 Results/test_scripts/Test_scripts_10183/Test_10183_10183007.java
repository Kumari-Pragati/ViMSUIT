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
public class Test_10183_10183007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowAppCrashesDuringMessageDisplay() throws InterruptedException {
        // Step 1: Open the app (already covered by ActivityTestRule)
        
        // Step 2: Wait for the loading screen to appear
        Thread.sleep(500);
        
        // Step 3: Verify the message 'Please wait while we send you to your provider to log in...' is displayed
        onView(withId(R.id.id_login_view)).check(ViewAssertions.matches(isDisplayed()));
        
        // Step 4: Wait for the app to redirect the user to the provider's login page
        Thread.sleep(500);
        
        // Expected result: App does not crash during message display
    }
}