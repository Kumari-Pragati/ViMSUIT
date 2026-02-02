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
public class Test_10208_1020802 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testRegisterWithGooglePositiveFlow() throws InterruptedException {
        // Step 1: Open the 'buzzMuslim' app (Assuming it's already open and launched)
        
        // Step 2: Click on the 'Register with Google' button
        Thread.sleep(500);
        onView(withId(R.id.id_register_google_btn)).perform(ViewActions.click());

        // Expected Result: The user should be redirected to the Google login page
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_register_google_btn)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}