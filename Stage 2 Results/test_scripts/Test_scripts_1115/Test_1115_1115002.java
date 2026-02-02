package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1115_1115002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignUpButtonShouldNavigateToSignUpPage() throws InterruptedException {
        // Click on the 'Sign Up' button at the bottom of the screen.
        onView(withId(R.id.id_button_sign_up)).perform(click());
        
        // Wait for 500ms to ensure navigation is complete.
        Thread.sleep(500);
        
        // Assert that the sign up page is displayed
        onView(withText("Sign Up")).inRoot(isDialog()).check(matches(withText("Sign Up")));
    }
}