package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_12675_1267506 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testForgotPasswordLinkFunctionality() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Enter a valid email address into the email field
        onView(withId(R.id.email_field)).perform(ViewActions.typeText("test@example.com"));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Enter a valid password into the password field
        onView(withId(R.id.password_field)).perform(ViewActions.typeText("password123"));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Tap the 'Forgot your password?' link
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for navigation
        
        // Expected Result: The user is redirected to the password reset screen
        onView(withId(R.id.password_reset_screen)).check(matches(ViewMatchers.isDisplayed()));
    }
}