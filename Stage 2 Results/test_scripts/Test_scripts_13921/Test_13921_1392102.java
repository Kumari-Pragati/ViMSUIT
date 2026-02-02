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
public class Test_13921_1392102 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        // Step 1: Enter 'invalidemail@gmail.com' into the email input field.
        onView(withId(R.id.id_login_email_field)).perform(ViewActions.typeText("invalidemail@gmail.com"));
        
        // Step 2: Enter 'password123' into the password input field.
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.id_login_password_field)).perform(ViewActions.typeText("password123"));
        
        // Step 3: Tap the 'Sign in' button.
        Thread.sleep(500);
        onView(withId(R.id.id_login_sign_in_button)).perform(ViewActions.click());
        
        // Expected Result: An error message is displayed indicating that the credentials are invalid.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Invalid email or password"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.FrameLayout.class)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}