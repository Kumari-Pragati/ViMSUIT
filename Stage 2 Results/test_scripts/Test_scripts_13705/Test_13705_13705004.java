package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_13705_13705004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(20000); // Set a longer timeout for this test

    @Test
    public void testNegativeFlowInvalidPasswordFormat() throws InterruptedException {
        // Step 1: Open the CareZone app (Assuming it's already open, or you have another way to start MainActivity)
        
        // Step 2: Navigate to the account creation page
        onView(withId(R.id.id_welcome_page_sign_password_edit)).perform(ViewActions.click());
        
        // Step 3: Enter a valid name in the 'Your name' field (Assuming there's a separate field for this, not part of password)
        
        // Step 4: Enter an invalid email format in the 'Your email' field
        onView(withId(R.id.id_welcome_page_sign_email_edit)).perform(clearText(), ViewActions.typeText("invalidemail"), ViewActions.closeSoftKeyboard());
        
        // Step 5: Enter an invalid password format in the 'Password' field
        Thread.sleep(500);
        onView(withId(R.id.id_welcome_page_sign_password_edit)).perform(clearText(), ViewActions.typeText("1234"), ViewActions.closeSoftKeyboard());
        
        // Step 6: Click on the 'CREATE A FREE ACCOUNT' button (Assuming there's a button with id R.id.create_account_button)
        Thread.sleep(500);
        onView(withId(R.id.create_account_button)).perform(ViewActions.click());
        
        // Expected Result: An error message should appear indicating that the password format is invalid
        Thread.sleep(500);
        onView(withText("Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one digit, and one special character.")).check(matches(ViewMatchers.isDisplayed()));
    }
}