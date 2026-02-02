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
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_13829_13829003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithFacebookNegativeFlowInvalidCredentials() throws InterruptedException {
        // Step 1: Open the Drug Index app (Assuming it's already open and on the login screen)
        
        // Step 2: Click on the Facebook login prompt
        onView(withText("Login with Facebook")).perform(click());
        
        Thread.sleep(500); // Wait for the Facebook dialog to appear
        
        // Step 3: Enter invalid credentials in the Facebook login dialog (Assuming the input fields are already present)
        // For simplicity, we will just simulate entering text
        onView(withId(R.id.email_input)).perform(ViewActions.typeText("invalidemail@com"));
        onView(withId(R.id.password_input)).perform(ViewActions.typeText("wrongpassword"));
        
        Thread.sleep(500); // Wait for the dialog to process the invalid credentials
        
        // Step 4: Click on the 'CONTINUE AS SAM' button
        onView(withId(R.id.id_gdp_dialog_continue_button)).perform(click());
        
        Thread.sleep(500); // Wait for the error message to appear
        
        // Expected Result: The app displays an error message indicating that the credentials are invalid
        onView(withText("Invalid email or password")).inRoot(isDialog()).check(matches(ViewMatchers.isDisplayed()));
    }
}