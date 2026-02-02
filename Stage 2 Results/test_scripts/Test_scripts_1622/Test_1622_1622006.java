package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_1622_1622006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidPassword() throws InterruptedException {
        // Step 1: Open the Vingle app (Assuming MainActivity is launched by default)
        
        // Step 2: Click on the 'Log In' button
        onView(withContentDescription("Log In")).perform(click());
        Thread.sleep(500);

        // Step 3: Select 'Start with Email' as the login option
        onView(withId(R.id.email_login_option)).perform(click());
        Thread.sleep(500);

        // Step 4: Enter valid email credentials (Assuming EditText for email is R.id.login_email)
        onView(withId(R.id.login_email)).perform(ViewActions.typeText("validemail@example.com"));
        Thread.sleep(500);

        // Step 5: Enter invalid password (Assuming EditText for password is R.id.login_password)
        onView(withId(R.id.login_password)).perform(ViewActions.typeText("invalidpassword123"));
        Thread.sleep(500);

        // Step 6: Click the 'Log In' button
        onView(withContentDescription("Log In")).perform(click());
        Thread.sleep(500);

        // Expected Result: Login attempt fails with error message (Assuming error message is shown in a Toast or Dialog)
        Espresso.onView(withText(R.string.login_error)).inRoot(ViewMatchers.withClassName(EditText.class.getName())).check(matches(isDisplayed()));
    }
}