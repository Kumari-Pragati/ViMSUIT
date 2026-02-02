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

@RunWith(AndroidJUnit4.class)
public class Test_10208_1020801 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testRegisterWithFacebookPositiveFlow() throws InterruptedException {
        // Step 1: Open the 'buzzMuslim' app (Assuming it's already open and launched)
        
        // Step 2: Click on the 'Register with Facebook' button
        Thread.sleep(500);
        onView(withId(R.id.id_register_fb_btn)).perform(ViewActions.click());

        // Expected Result: The user should be redirected to the Facebook login page.
        Thread.sleep(500);
        Espresso.onView(hasDesc("Facebook Login Button")).check(ViewAssertions.matches(isDisplayed()));
    }
}