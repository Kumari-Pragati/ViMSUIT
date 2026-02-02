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
public class Test_12675_1267504 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithShowToggle() throws InterruptedException {
        // Open the app and navigate to the login screen (assuming it's already there)
        
        // Enter a valid email address into the email field
        onView(withId(R.id.email_field)).perform(typeText("test@example.com"));
        Thread.sleep(500);

        // Enter a valid password into the password field
        onView(withId(R.id.password_field)).perform(typeText("password123"));
        Thread.sleep(500);

        // Loop through all 3 elements and perform test steps on each

        // Element 1: withContentDescription("[None]") - com.hyvee.android:id/sign_in_button_forgot_password
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.sign_in_button_forgot_password)).check(matches(ViewMatchers.isDisplayed()));
        
        // Element 2: withContentDescription("[None]") - com.hyvee.android:id/sign_in_button
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.sign_in_button)).check(matches(ViewMatchers.isDisplayed()));

        // Element 3: withContentDescription("[None]") - com.hyvee.android:id/sign_in_button_cancel
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.sign_in_button_cancel)).check(matches(ViewMatchers.isDisplayed()));

        // Toggle the 'Show' button to reveal the password (assuming it's a separate element)
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Tap the 'Sign In' button
        Espresso.onView(withId(R.id.sign_in_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify that the user is successfully logged in and redirected to the home screen
        Espresso.onView(ViewMatchers.withText("Home Screen Title")).check(matches(ViewMatchers.isDisplayed()));
    }
}