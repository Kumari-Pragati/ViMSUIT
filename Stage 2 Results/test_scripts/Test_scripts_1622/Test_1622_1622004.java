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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(JUnit4.class)
public class Test_1622_1622004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidEmail() throws InterruptedException {
        // Step 1: Open the Vingle app (Assuming MainActivity is the entry point)
        
        // Step 2: Click on the 'Log In' button
        onView(withContentDescription("Log In")).perform(click());
        Thread.sleep(500);

        // Step 3: Select 'Start with Email' as the login option
        onView(withId(R.id.email_login_option)).perform(click());
        Thread.sleep(500);

        // Step 4: Enter invalid email credentials
        EditText emailField = (EditText) activityTestRule.getActivity().findViewById(R.id.email_field);
        emailField.perform(typeText("invalidemail@"));
        Thread.sleep(500);

        // Step 5: Enter password
        EditText passwordField = (EditText) activityTestRule.getActivity().findViewById(R.id.password_field);
        passwordField.perform(typeText("password123"));
        Thread.sleep(500);

        // Step 6: Click the 'Log In' button
        onView(withId(R.id.login_button)).perform(click());
        Thread.sleep(500);

        // Expected Result: Login attempt fails with error message
        onView(withContentDescription("[None]")).check(matches(ViewMatchers.withText("Invalid email or password")));
    }
}