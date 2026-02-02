package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12176_1217604 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignInButtonWithInvalidCredentials throws InterruptedException {
        // Step 1: Click on the 'Sign In' button.
        onView(withId(R.id.id_fragment_main_sign_in_button)).perform(ViewActions.click());
        
        // Wait for UI to update
        Thread.sleep(500);
        
        // Step 2: Enter invalid email and password in the sign-in form.
        Espresso.onView(ViewMatchers.withId(R.id.id_edit_text_email))
                .perform(ViewActions.typeText("invalidemail@example.com"));
        Espresso.onView(ViewMatchers.withId(R.id.id_edit_text_password))
                .perform(ViewActions.typeText("wrongpassword123"));
        
        // Wait for UI to update
        Thread.sleep(500);
        
        // Step 3: Click on the 'Sign In' button again.
        onView(withId(R.id.id_fragment_main_sign_in_button)).perform(ViewActions.click());
        
        // Wait for UI to update
        Thread.sleep(500);
        
        // Expected Result: The app should display an error message indicating invalid credentials.
        Espresso.onView(ViewMatchers.withId(R.id.id_text_view_error_message))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}