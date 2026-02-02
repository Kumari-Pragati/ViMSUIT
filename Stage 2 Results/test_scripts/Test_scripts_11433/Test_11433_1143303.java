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
public class Test_11433_1143303 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowMissingEmailField() throws InterruptedException {
        // Element 1: More options
        onView(withContentDescription("More options"))
                .perform(click());
        Thread.sleep(500);
        
        // First Name field
        onView(ViewMatchers.withId(R.id.first_name_field))
                .perform(ViewActions.typeText("John"));
        Thread.sleep(500);

        // Last Name field
        onView(ViewMatchers.withId(R.id.last_name_field))
                .perform(ViewActions.typeText("Doe"));
        Thread.sleep(500);

        // Phone field
        onView(ViewMatchers.withId(R.id.phone_field))
                .perform(ViewActions.typeText("1234567890"));
        Thread.sleep(500);

        // Registration Code field
        onView(ViewMatchers.withId(R.id.registration_code_field))
                .perform(ViewActions.typeText("1234567890"));
        Thread.sleep(500);

        // Email field - leave it empty
        Espresso.closeSoftKeyboard();
        Thread.sleep(500);

        // Password field
        onView(ViewMatchers.withId(R.id.password_field))
                .perform(ViewActions.typeText("password123"));
        Thread.sleep(500);

        // Confirm Password field
        onView(ViewMatchers.withId(R.id.confirm_password_field))
                .perform(ViewActions.typeText("password123"));
        Thread.sleep(500);

        // Security Question field
        onView(ViewMatchers.withId(R.id.security_question_field))
                .perform(ViewActions.typeText("What is your mother's maiden name?"));
        Thread.sleep(500);

        // Register button
        Espresso.onView(ViewMatchers.withId(R.id.register_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify error message for Email field
        Espresso.onView(ViewMatchers.withText("Email is required"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 2: Navigate up
        onView(withContentDescription("Navigate up"))
                .perform(click());
        Thread.sleep(500);
    }
}