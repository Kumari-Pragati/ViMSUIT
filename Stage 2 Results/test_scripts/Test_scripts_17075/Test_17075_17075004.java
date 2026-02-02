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
public class Test_17075_17075004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSignInWithInvalidYahooCredentials() throws InterruptedException {
        // Step 1: Open the application (Assumed to be opened by ActivityTestRule)
        
        // Step 2: Tap on the 'Sign in or create account' button
        onView(withId(R.id.id_button_sign_in_or_sign_up)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Enter the invalid Yahoo username in the input field
        Espresso.onView(ViewMatchers.withId(R.id.id_yahoo_username_input))
                .perform(ViewActions.typeText("invalidusername"));
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Enter the invalid Yahoo password in the input field
        Espresso.onView(ViewMatchers.withId(R.id.id_yahoo_password_input))
                .perform(ViewActions.typeText("invalidpassword"));
        Thread.sleep(500); // Wait for UI to update
        
        // Step 5: Tap the 'Sign in' button
        onView(withId(R.id.id_sign_in_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The user is presented with an error message indicating invalid login credentials
        Espresso.onView(ViewMatchers.withId(R.id.id_error_message))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}