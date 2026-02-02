package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_12176_1217610 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignInButtonWithInvalidPasswordFormat() throws InterruptedException {
        // Step 1: Click on the 'Sign In' button.
        onView(withId(R.id.id_fragment_main_sign_in_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Enter an invalid password format in the sign-in form.
        Espresso.onView(withId(R.id.id_edit_text_password)).perform(ViewActions.typeText("invalidPassword!"));
        Espresso.onView(withId(R.id.id_edit_text_username)).perform(ViewActions.typeText("testUser"));

        // Step 3: Click on the 'Sign In' button again to trigger validation.
        onView(withId(R.id.id_fragment_main_sign_in_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should display an error message indicating the password format is invalid.
        Espresso.onView(withId(R.id.id_text_input_error_message))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}