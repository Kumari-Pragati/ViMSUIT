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
public class Test_13921_1392105 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidEmailFormat() throws InterruptedException {
        // Step 1: Enter 'appcrawler4.com' into the email input field.
        onView(withId(R.id.id_login_email_field)).perform(ViewActions.typeText("appcrawler4.com"));
        
        // Step 2: Enter 'password123' into the password input field.
        onView(withId(R.id.id_login_password_field)).perform(ViewActions.typeText("password123"));
        
        // Step 3: Tap the 'Sign in' button.
        onView(withId(R.id.id_login_sign_in_button)).perform(ViewActions.click());
        
        // Wait for 500ms to ensure the error message is displayed
        Thread.sleep(500);
        
        // Expected result: An error message is displayed indicating that the email format is invalid.
        onView(ViewMatchers.withText("Invalid email format")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}