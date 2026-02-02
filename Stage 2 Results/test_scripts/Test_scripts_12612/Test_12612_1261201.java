package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ImageButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)
public class Test_12612_1261201 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithValidCredentials() throws InterruptedException {
        // Open the app (already done by ActivityTestRule)

        // Click on the 'LOG IN' button
        onView(withText("LOG IN")).perform(click());
        Thread.sleep(500);  // Wait for UI to update

        // Enter a valid email in the email field
        onView(withId(R.id.email_field)).perform(typeText("validemail@example.com"));
        Thread.sleep(500);

        // Enter a valid password in the password field
        onView(withId(R.id.password_field)).perform(typeText("validpassword123"));
        Thread.sleep(500);

        // Click on the 'LOG IN' button
        onView(withText("LOG IN")).perform(click());
        Thread.sleep(500);  // Wait for UI to update

        // Verify that the user is logged in successfully
        onView(withContentDescription("['Main Menu Closed']")).check(matches(isDisplayed()));
    }
}