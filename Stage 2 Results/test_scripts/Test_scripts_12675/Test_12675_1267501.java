package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Before;
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
public class Test_12675_1267501 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity mainActivity;

    @Before
    public void setUp() {
        mainActivity = activityRule.getActivity();
    }

    @Test
    public void testLoginWithValidCredentials throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Enter a valid email address into the email field
        onView(withId(R.id.email_field)).perform(ViewActions.typeText("validemail@example.com"));

        // Step 3: Enter a valid password into the password field
        Thread.sleep(500); // Wait for UI to update after typing in email
        onView(withId(R.id.password_field)).perform(ViewActions.typeText("validpassword123"));

        // Step 4: Tap the 'Sign In' button
        Thread.sleep(500); // Wait for UI to update after typing in password
        onView(withContentDescription("[None]")).perform(click());

        // Expected Result: The user is successfully logged in and redirected to the home screen
        Thread.sleep(1000); // Wait for login process

        // Assert that we are on the home screen
        onView(withId(R.id.home_screen)).check(matches(ViewMatchers.isDisplayed()));
    }
}