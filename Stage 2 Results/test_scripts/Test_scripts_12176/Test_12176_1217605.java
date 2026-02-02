package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_12176_1217605 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignUpButtonWithValidCredentials() throws InterruptedException {
        // Step 1: Click on the 'Sign Up' button.
        onView(allOf(withId(R.id.id_fragment_main_sign_up_button), withText("Sign Up"))).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 2: Enter valid email and password in the sign-up form.
        Espresso.onView(withId(R.id.email_input)).perform(ViewActions.typeText("validemail@example.com"));
        Espresso.onView(withId(R.id.password_input)).perform(ViewActions.typeText("validpassword123"));
        Thread.sleep(500);

        // Expected Result: The app should navigate to the sign-up form with the entered credentials.
        Espresso.onView(allOf(withId(R.id.email_input), withText("validemail@example.com"))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(allOf(withId(R.id.password_input), withText("validpassword123"))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Additional assertion to check if the sign-up form is displayed
        Espresso.onView(withText("Sign Up")).inRoot(isDialog()).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}