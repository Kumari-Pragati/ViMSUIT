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

@RunWith(AndroidJUnit4.class)
public class Test_17075_17075003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSignInWithEmptyFields() throws InterruptedException {
        // Step 1: Open the application (Assumed to be done by ActivityTestRule)

        // Step 2: Tap on the 'Sign in or create account' button
        onView(withId(R.id.id_button_sign_in_or_sign_up)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Leave the Yahoo username input field empty.
        // Assuming the username input field is withId(R.id.username_input)
        Espresso.onView(withId(R.id.username_input)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 4: Leave the Yahoo password input field empty.
        // Assuming the password input field is withId(R.id.password_input)
        Espresso.onView(withId(R.id.password_input)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 5: Tap the 'Sign in' button
        onView(withId(R.id.id_button_sign_in_or_sign_up)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: The user is presented with an error message indicating required fields are empty.
        Espresso.onView(withId(R.id.error_message)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}