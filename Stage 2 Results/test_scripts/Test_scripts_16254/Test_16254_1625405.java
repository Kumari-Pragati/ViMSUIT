package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_16254_1625405 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testForgotPasswordLinkFunctionality() throws InterruptedException {
        // Step 1: Enter 'testuser' in the 'Username' field (Assuming there is an EditText for username)
        Espresso.onView(withId(R.id.id_username_edit_text)).perform(ViewActions.typeText("testuser"));

        // Step 2: Click on the 'Forgot Password?' link
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_login_button)).perform(ViewActions.click());

        // Expected Result: The user is redirected to the password reset page (Assuming there is a TextView or similar element that indicates the password reset page)
        Thread.sleep(500);
        Espresso.onView(withId(R.id.password_reset_page_indicator)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}