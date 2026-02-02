package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_13420_1342004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmail() throws InterruptedException {
        // Element 1: Facebook Login Button
        onView(withContentDescription("[None]")).inRoot(isDialog()).perform(click());
        Thread.sleep(500);
        
        // Enter email address
        Espresso.onView(ViewMatchers.withId(com.groupme.android:id/email_input)).perform(ViewActions.typeText("test@example.com"));
        Thread.sleep(500);

        // Enter password
        Espresso.onView(ViewMatchers.withId(com.groupme.android:id/password_input)).perform(ViewActions.typeText("password123"));
        Thread.sleep(500);

        // Click on the 'Login' button
        Espresso.onView(ViewMatchers.withId(com.groupme.android:id/login_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify that the user is logged in successfully
        Espresso.onView(ViewMatchers.withText("Welcome, Test User")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Element 2: Microsoft Login Button
        onView(withContentDescription("[None]")).inRoot(isDialog()).perform(click());
        Thread.sleep(500);
        
        // Enter email address
        Espresso.onView(ViewMatchers.withId(com.groupme.android:id/email_input)).perform(ViewActions.typeText("test@example.com"));
        Thread.sleep(500);

        // Enter password
        Espresso.onView(ViewMatchers.withId(com.groupme.android:id/password_input)).perform(ViewActions.typeText("password123"));
        Thread.sleep(500);

        // Click on the 'Login' button
        Espresso.onView(ViewMatchers.withId(com.groupme.android:id/login_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify that the user is logged in successfully
        Espresso.onView(ViewMatchers.withText("Welcome, Test User")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}