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

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_16254_1625402 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        // Step 1: Enter 'invaliduser' in the 'Username' field
        onView(withId(R.id.id_username)).perform(clearText()).perform(ViewActions.typeText("invaliduser"));

        // Step 2: Enter 'invalidpass' in the 'Password' field
        onView(withId(R.id.id_password)).perform(clearText()).perform(ViewActions.typeText("invalidpass"));

        // Step 3: Click on the 'Sign In' button
        Thread.sleep(500);
        onView(withId(R.id.id_login_button)).perform(click());

        // Wait for 500ms to ensure the error message is displayed
        Thread.sleep(500);

        // Expected result: An error message is displayed indicating incorrect credentials
        onView(withText("Incorrect username or password")).inRoot(ViewMatchers.withParent(
                new RootMatcher(RootViewMatchers.isDialog()))).check(matches(isDisplayed()));
    }
}