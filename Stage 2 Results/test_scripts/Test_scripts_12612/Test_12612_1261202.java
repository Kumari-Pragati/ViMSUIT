package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class Test_12612_1261202 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        // Step 1: Open the app (Assumed to be opened by default when using ActivityTestRule)

        // Step 2: Click on the 'LOG IN' button
        onView(withId(R.id.login_button)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Enter an invalid email in the email field
        onView(withId(R.id.email_field)).perform(ViewActions.typeText("invalidemail@example.com"));

        Thread.sleep(500); // Wait for UI to update

        // Step 4: Enter a valid password in the password field
        onView(withId(R.id.password_field)).perform(ViewActions.typeText("validpassword123"));

        Thread.sleep(500); // Wait for UI to update

        // Step 5: Click on the 'LOG IN' button
        onView(withId(R.id.login_button)).perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Expected Result: An error message is displayed indicating invalid credentials
        onView(withContentDescription("['Main Menu Closed']")).check(matches(ViewMatchers.isDisplayed()));

        Espresso.pressBack(); // Close the app after test
    }
}