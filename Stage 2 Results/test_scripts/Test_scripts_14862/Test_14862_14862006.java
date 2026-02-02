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

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_14862_14862006 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnIveForgottenMyPasswordLink throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (assumed by default)
        
        // Step 2: Enter 'appcrawler2@gmail.com' into the email input field
        onView(withId(R.id.id_login_edittext_email)).perform(ViewActions.typeText("appcrawler2@gmail.com"), ViewActions.closeSoftKeyboard());

        // Step 3: Enter 'SecurePassword123' into the password input field
        Thread.sleep(500);
        onView(withId(R.id.id_login_edittext_password)).perform(ViewActions.typeText("SecurePassword123"), ViewActions.closeSoftKeyboard());

        // Step 4: Tap the 'I've forgotten my password' link
        Thread.sleep(500);
        onView(withText("I've forgotten my password")).perform(ViewActions.click());

        // Expected Result: The user is redirected to the password reset screen
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_password_reset_screen)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}