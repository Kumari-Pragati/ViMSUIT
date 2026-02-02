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
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_1622_1622008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        // Step 1: Open the Vingle app (Assuming it's already open, or this step is handled by setup)
        
        // Step 2: Click on the 'Log In' button
        onView(withId(R.id.login_button)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Select 'Start with Email' as the login option (Assuming it's already selected)
        
        // Step 4: Enter invalid email credentials
        onView(withId(R.id.email_input)).perform(ViewActions.typeText("invalidemail@vingle.com"), closeSoftKeyboard());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 5: Enter invalid password
        onView(withId(R.id.password_input)).perform(ViewActions.typeText("wrongpassword123"), closeSoftKeyboard());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 6: Click the 'Log In' button
        onView(withId(R.id.login_button)).perform(click());
        
        Thread.sleep(500); // Wait for error message to appear
        
        // Expected Result: Login attempt fails with error message
        onView(withText("Invalid email or password")).inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(EditText.class))).check(matches(isDisplayed()));
    }
}