package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11433_1143301 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowCompleteAllFieldsAndRegisterSuccessfully() throws InterruptedException {
        // Element 1: More options
        onView(withContentDescription("['More options']"))
                .perform(click());
        Thread.sleep(500);
        
        // Verify state of the first element (optional)
        onView(withId(R.id.first_name_edit_text)).check(matches(ViewMatchers.isDisplayed()));
        
        // Element 2: Navigate up
        onView(withContentDescription("['Navigate up']"))
                .perform(click());
        Thread.sleep(500);

        // Test steps for all fields and register button

        // First Name field
        onView(withId(R.id.first_name_edit_text))
                .perform(ViewActions.click(), typeText("John"), ViewActions.closeSoftKeyboard());

        // Last Name field
        onView(withId(R.id.last_name_edit_text))
                .perform(ViewActions.click(), typeText("Doe"), ViewActions.closeSoftKeyboard());

        // Phone field
        onView(withId(R.id.phone_edit_text))
                .perform(ViewActions.click(), typeText("1234567890"), ViewActions.closeSoftKeyboard());

        // Registration Code field
        onView(withId(R.id.registration_code_edit_text))
                .perform(ViewActions.click(), typeText("1234567890"), ViewActions.closeSoftKeyboard());

        // Email field
        onView(withId(R.id.email_edit_text))
                .perform(ViewActions.click(), typeText("john.doe@example.com"), ViewActions.closeSoftKeyboard());

        // Password field
        onView(withId(R.id.password_edit_text))
                .perform(ViewActions.click(), typeText("password123"), ViewActions.closeSoftKeyboard());

        // Confirm Password field
        onView(withId(R.id.confirm_password_edit_text))
                .perform(ViewActions.click(), typeText("password123"), ViewActions.closeSoftKeyboard());

        // Security Question field
        onView(withId(R.id.security_question_edit_text))
                .perform(ViewActions.click(), typeText("What is your mother's maiden name?"), ViewActions.closeSoftKeyboard());

        // Register button
        onView(withId(R.id.register_button))
                .perform(ViewActions.click());

        Thread.sleep(500);

        // Verify successful registration and redirection to home screen (optional)
        Espresso.onView(ViewMatchers.withText("Welcome, John Doe!")).check(matches(ViewMatchers.isDisplayed()));
    }
}