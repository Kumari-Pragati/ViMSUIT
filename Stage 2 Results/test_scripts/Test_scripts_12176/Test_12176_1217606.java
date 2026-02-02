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
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_12176_1217606 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignInButtonWithValidCredentials() throws InterruptedException {
        // Step 1: Click on the 'Sign In' button.
        onView(withId(R.id.id_fragment_main_sign_in_button)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Enter valid email and password in the sign-in form.
        Espresso.onView(ViewMatchers.withId(R.id.email_input)).perform(ViewActions.typeText("validemail@example.com"));
        Espresso.onView(ViewMatchers.withId(R.id.password_input)).perform(ViewActions.typeText("validpassword123"));
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should navigate to the sign-in form with the entered credentials.
        Espresso.onView(withId(R.id.email_input)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.password_input)).check(matches(isDisplayed()));

        // Additional assertion to check if the next screen is displayed
        Espresso.onView(ViewMatchers.withId(R.id.sign_in_form)).check(matches(isDisplayed()));
    }
}