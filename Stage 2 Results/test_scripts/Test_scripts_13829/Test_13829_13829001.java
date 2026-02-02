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
public class Test_13829_13829001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testLoginWithFacebookPositiveFlow() throws InterruptedException {
        // Step 1: Open the Drug Index app (Assuming it's already open and launched)
        
        // Step 2: Click on the Facebook login prompt
        Espresso.onView(withId(R.id.facebook_login_button)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for the dialog to appear
        
        // Step 3: Click on the 'CONTINUE AS SAM' button
        Espresso.onView(withId(R.id.id_gdp_dialog_continue_button)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withId(R.id.id_gdp_dialog_continue_button)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for the login process to complete
        
        // Expected Result: The user is logged into the Drug Index app using their Facebook credentials
        // Here we can add assertions based on expected UI elements or actions after successful login
        Espresso.onView(withId(R.id.main_content)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}