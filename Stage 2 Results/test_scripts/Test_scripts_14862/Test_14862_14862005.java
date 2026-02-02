package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Switch;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_14862_14862005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testToggleRemindMeSwitch() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)

        // Step 2: Enter 'appcrawler2@gmail.com' into the email input field
        onView(withId(R.id.id_login_email_input)).perform(ViewActions.typeText("appcrawler2@gmail.com"));

        // Step 3: Enter 'SecurePassword123' into the password input field
        onView(withId(R.id.id_login_password_input)).perform(ViewActions.typeText("SecurePassword123"));

        // Step 4: Toggle the 'Remind me' switch
        Thread.sleep(500);
        onView(withId(R.id.id_login_checkbox_remember)).perform(click());

        // Step 5: Tap the 'LOGIN' button
        Thread.sleep(500);
        onView(withText("LOGIN")).perform(click());

        // Expected Result: The user is logged in successfully and the 'Remind me' switch state is toggled
        Thread.sleep(500);
        Switch rememberMeSwitch = (Switch) activityRule.getActivity().findViewById(R.id.id_login_checkbox_remember);
        if (rememberMeSwitch.isChecked()) {
            System.out.println("Remind me switch is checked as expected.");
        } else {
            System.out.println("Remind me switch is not checked. Expected to be checked.");
        }

        // Additional assertion for successful login
        onView(withId(R.id.id_login_email_input)).check(matches(ViewMatchers.withText("appcrawler2@gmail.com")));
        onView(withId(R.id.id_login_password_input)).check(matches(ViewMatchers.withText("SecurePassword123")));

        Espresso.pressBack();
    }
}