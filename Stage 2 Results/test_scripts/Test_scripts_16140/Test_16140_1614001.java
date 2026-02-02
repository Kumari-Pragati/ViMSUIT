package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Test_16140_1614001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSignUp() throws InterruptedException {
        // Step 1: Click on the 'Kaydol' (Sign Up) button
        onView(withId(R.id.id_register_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Enter a valid email address in the email input field
        onView(withId(R.id.email_input_field)).perform(ViewActions.typeText("test@example.com"));
        Thread.sleep(500);

        // Step 3: Enter a valid password in the password input field
        onView(withId(R.id.password_input_field)).perform(ViewActions.typeText("TestPassword123"));
        Thread.sleep(500);

        // Step 4: Click on the 'Kaydol' (Sign Up) button again to submit the form
        onView(withId(R.id.id_register_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The user is successfully registered and redirected to the login screen
        Espresso.onView(ViewMatchers.withText("Login")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}