package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_12675_1267502 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Enter an invalid email address into the email field
        onView(withId(R.id.email_field)).perform(typeText("invalidemail@example.com"));
        Thread.sleep(500);

        // Step 3: Enter a valid password into the password field
        onView(withId(R.id.password_field)).perform(clearText(), typeText("validpassword123"));
        Thread.sleep(500);

        // Step 4: Tap the 'Sign In' button
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: An error message is displayed indicating invalid credentials
        onView(withId(R.id.error_message)).check(matches(ViewMatchers.isDisplayed()));
    }
}