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
public class Test_16140_1614006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyPassword() throws InterruptedException {
        // Step 1: Click on the 'Oturum aç' (Log In) button
        onView(withId(R.id.id_first_login_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Enter a valid email address in the email input field
        Espresso.onView(ViewMatchers.withId(R.id.email_input_field))
                .perform(ViewActions.typeText("valid@example.com"));
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Enter an empty password in the password input field
        Espresso.onView(ViewMatchers.withId(R.id.password_input_field))
                .perform(ViewActions.clearText(), ViewActions.typeText(""));
        Thread.sleep(500); // Wait for UI to update

        // Step 4: Click on the 'Oturum aç' (Log In) button again to submit the form
        onView(withId(R.id.id_first_login_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app displays an error message indicating an empty password
        Espresso.onView(ViewMatchers.withId(R.id.error_message))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}