package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatEditText;
import org.junit.Rule;
import org.junit.Test;

public class Test_13921_1392101 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithValidCredentials() throws InterruptedException {
        // Step 1: Enter 'appcrawler4@gmail.com' into the email input field.
        Thread.sleep(500);
        onView(withId(R.id.id_login_email_field)).perform(ViewActions.typeText("appcrawler4@gmail.com"));

        // Step 2: Enter 'password123' into the password input field.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_login_password_field))
                .perform(ViewActions.typeText("password123"));

        // Step 3: Tap the 'Sign in' button.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_sign_in_button)).perform(ViewActions.click());

        // Expected Result: The user is successfully logged in and redirected to the main screen.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Main Screen Title")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}