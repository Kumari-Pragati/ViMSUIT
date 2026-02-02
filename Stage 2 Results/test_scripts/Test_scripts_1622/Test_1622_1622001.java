package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1622_1622001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithFacebook() throws InterruptedException {
        // Step 1: Open the Vingle app (Assuming it's already open, or this step is handled by setup)

        // Step 2: Click on the 'Log In' button
        Thread.sleep(500);
        onView(withText("Log In")).perform(click());

        // Step 3: Select 'Facebook' as the login option
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click()); // Assuming Facebook is selected by this click

        // Step 4: Enter Facebook credentials (Not implemented due to lack of UI interaction for entering credentials)
        // Step 5: Click the 'Log In' button
        Thread.sleep(500);
        onView(withText("Log In")).inRoot(isDialog()).perform(click());

        // Step 6: Verify if the user is logged in successfully
        Thread.sleep(500);
        onView(withId(R.id.pager)).check(matches(withText("Welcome, User"))); // Assuming a welcome message is shown

        // Additional assertion to check for successful login (e.g., checking for specific UI elements)
        Espresso.onView(withText("Home")).check(matches(isDisplayed()));
    }
}