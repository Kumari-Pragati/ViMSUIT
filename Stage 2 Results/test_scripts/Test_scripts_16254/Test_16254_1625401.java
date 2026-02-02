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
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_16254_1625401 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithValidCredentials() throws InterruptedException {
        // Step 1: Enter 'testuser' in the 'Username' field
        onView(withId(R.id.id_username_field)).perform(typeText("testuser"), ViewActions.closeSoftKeyboard());

        // Step 2: Enter 'testpass' in the 'Password' field
        Thread.sleep(500);
        onView(withId(R.id.id_password_field)).perform(clearText(), typeText("testpass"), ViewActions.closeSoftKeyboard());

        // Step 3: Click on the 'Sign In' button
        Thread.sleep(500);
        onView(withId(R.id.id_login_button)).perform(ViewActions.click());

        // Expected Result: The user is logged in successfully and redirected to the main content area
        Thread.sleep(500);
        onView(withText("Main Content Area")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}