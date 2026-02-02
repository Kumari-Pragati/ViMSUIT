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
public class Test_12176_1217609 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignUpButtonWithInvalidPasswordFormat() throws InterruptedException {
        // Step 1: Click on the 'Sign Up' button.
        onView(withId(R.id.id_fragment_main_sign_up_button)).perform(ViewActions.click());
        
        // Step 2: Enter an invalid password format in the sign-up form.
        Thread.sleep(500); // Wait for UI to update
        
        // Assuming there is a text input field with id R.id.id_fragment_main_password
        onView(withId(R.id.id_fragment_main_password)).perform(ViewActions.typeText("invalidPassword!"));
        
        // Step 3: Verify the error message is displayed.
        Thread.sleep(500); // Wait for UI to update
        
        Espresso.onView(withText("Password must contain at least one uppercase letter, one lowercase letter, and one number."))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}