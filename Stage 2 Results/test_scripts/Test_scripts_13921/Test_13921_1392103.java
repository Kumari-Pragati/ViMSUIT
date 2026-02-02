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
public class Test_13921_1392103 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmptyEmailField throws InterruptedException {
        // Step 1: Enter 'password123' into the password input field.
        Espresso.onView(ViewMatchers.withId(R.id.id_login_password_field))
                .perform(ViewActions.typeText("password123"));

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Tap the 'Sign in' button.
        Espresso.onView(ViewMatchers(withId(R.id.id_login_sign_in_button)))
                .perform(ViewActions.click());

        Thread.sleep(500); // Wait for error message to appear

        // Expected Result: An error message is displayed indicating that the email field is required.
        Espresso.onView(ViewMatchers.withText("Email is required"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}