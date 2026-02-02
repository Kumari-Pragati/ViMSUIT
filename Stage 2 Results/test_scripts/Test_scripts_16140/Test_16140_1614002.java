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

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_16140_1614002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowLogIn() throws InterruptedException {
        // Step 1: Click on the 'Oturum aç' (Log In) button
        onView(withId(R.id.id_first_login_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Enter a valid email address in the email input field
        Espresso.onView(withText("Email")).inRoot(isDialog()).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.email_input_field)).perform(ViewActions.typeText("validemail@example.com"));
        closeSoftKeyboard();
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Enter a valid password in the password input field
        Espresso.onView(withText("Password")).inRoot(isDialog()).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.password_input_field)).perform(ViewActions.typeText("validpassword"));
        closeSoftKeyboard();
        Thread.sleep(500); // Wait for UI to update

        // Step 4: Click on the 'Oturum aç' (Log In) button again to submit the form
        Espresso.onView(withId(R.id.id_first_login_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The user is successfully logged in and redirected to the main content screen
        Espresso.onView(withText("Welcome")).check(matches(isDisplayed()));
    }
}