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
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10183_10183001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testPositiveFlowUserIsRedirectedToProviderForLogin() throws InterruptedException {
        // Step 1: Open the app (Assumed to be done by ActivityTestRule)
        
        // Step 2: Wait for the loading screen to appear
        Thread.sleep(500);
        
        // Step 3: Verify the message 'Please wait while we send you to your provider to log in...' is displayed
        Espresso.onView(withText("Please wait while we send you to your provider to log in..."))
                .check(ViewAssertions.matches(withText("Please wait while we send you to your provider to log in...")));
        
        // Step 4: Wait for the app to redirect the user to the provider's login page
        Thread.sleep(500);
        
        // Step 5: Verify that the WebView is clickable and focusable, indicating a redirection
        Espresso.onView(withId(R.id.id_login_view))
                .check(ViewAssertions.matches(withId(R.id.id_login_view).clickable(true).focusable(true)));
    }
}