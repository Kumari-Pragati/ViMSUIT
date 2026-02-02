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
public class Test_12176_1217608 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignInButtonWithInvalidEmailFormat throws InterruptedException {
        // Step 1: Click on the 'Sign In' button.
        onView(withId(R.id.id_fragment_main_sign_in_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Enter an invalid email format in the sign-in form.
        Espresso.onView(ViewMatchers.withId(R.id.id_edit_text_email))
                .perform(ViewActions.typeText("invalidemail"))
                .perform(ViewActions.closeSoftKeyboard());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should display an error message indicating the email format is invalid.
        Espresso.onView(ViewMatchers.withId(R.id.id_text_input_error))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}