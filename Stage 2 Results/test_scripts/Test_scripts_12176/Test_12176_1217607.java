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

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_12176_1217607 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignUpButtonWithInvalidEmailFormat throws InterruptedException {
        // Step 1: Click on the 'Sign Up' button.
        onView(withId(R.id.id_fragment_main_sign_up_button)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Enter an invalid email format in the sign-up form.
        onView(withText("Enter your email")).perform(ViewActions.typeText("invalidemail"));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The app should display an error message indicating the email format is invalid.
        onView(withId(R.id.error_message)).check(matches(withText("Please enter a valid email address.")));
    }
}