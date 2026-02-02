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
public class Test_14862_14862002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Enter 'invalidemail@gmail.com' into the email input field
        onView(withId(R.id.id_login_edittext_email)).perform(ViewActions.typeText("invalidemail@gmail.com"));
        Thread.sleep(500);

        // Step 3: Enter 'SecurePassword123' into the password input field
        onView(withId(R.id.id_login_edittext_password)).perform(ViewActions.typeText("SecurePassword123"));
        Thread.sleep(500);

        // Step 4: Tap the 'LOGIN' button (Assuming the login button has id R.id.id_login_button)
        onView(withId(R.id.id_login_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: An error message is displayed indicating invalid credentials
        onView(withText("Invalid email or password")).inRoot(isToast()).check(matches(isDisplayed()));
    }
}