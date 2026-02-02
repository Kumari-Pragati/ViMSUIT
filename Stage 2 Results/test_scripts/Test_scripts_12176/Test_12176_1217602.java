package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_12176_1217602 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignInButtonFunctionality() throws InterruptedException {
        // Wait for the view to be displayed before interacting with it
        Thread.sleep(500);
        
        // Click on the 'Sign In' button
        onView(withId(R.id.id_fragment_main_sign_in_button)).perform(click());
        
        // Wait for the next screen to load
        Thread.sleep(500);
        
        // Assert that the sign-in form is displayed
        onView(withId(R.id.sign_in_form)).check(ViewAssertions.matches(isDisplayed()));
    }
}