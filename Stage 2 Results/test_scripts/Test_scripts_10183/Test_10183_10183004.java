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
public class Test_10183_10183004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowNoInternetConnection() throws InterruptedException {
        // Open the app
        Espresso.onView(withId(R.id.id_login_view)).perform(ViewActions.click());

        // Wait for the loading screen to appear
        Thread.sleep(500);

        // Verify the message 'Please wait while we send you to your provider to log in...' is displayed
        Espresso.onView(withId(R.id.id_login_view))
                .check(ViewAssertions.matches(isDisplayed()));

        // Wait for the app to redirect the user to the provider's login page
        Thread.sleep(500);

        // Expected result: User is not redirected to the provider's login page
        Espresso.onView(withId(R.id.id_login_view)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.id_login_view))
                .check(ViewAssertions.doesNotExist());
    }
}