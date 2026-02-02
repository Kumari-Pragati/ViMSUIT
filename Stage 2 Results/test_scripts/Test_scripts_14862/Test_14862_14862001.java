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
public class Test_14862_14862001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithValidCredentials() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Enter 'appcrawler2@gmail.com' into the email input field
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_login_edittext_email)).perform(ViewActions.typeText("appcrawler2@gmail.com"));

        // Step 3: Enter 'SecurePassword123' into the password input field
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_login_password_field)).perform(ViewActions.typeText("SecurePassword123"));

        // Step 4: Tap the 'LOGIN' button
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_login_button)).perform(ViewActions.click());

        // Expected Result: The user is logged in successfully and redirected to the home screen
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Home Screen Title")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}