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
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_13705_13705006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(20000); // Set a longer timeout for the test

    @Test
    public void testNegativeFlowEmptyPassword() throws InterruptedException {
        // Step 1: Open the CareZone app (Assuming MainActivity is launched by default)
        
        // Step 2: Navigate to the account creation page
        onView(withId(R.id.id_welcome_page_sign_password_edit)).perform(ViewActions.clearText());
        Thread.sleep(500);

        // Step 3: Enter a valid name in the 'Your name' field (Assuming id for name is R.id.id_welcome_page_sign_name)
        onView(withId(R.id.id_welcome_page_sign_name)).perform(ViewActions.typeText("John Doe"));
        Thread.sleep(500);

        // Step 4: Enter a valid email in the 'Your email' field (Assuming id for email is R.id.id_welcome_page_sign_email)
        onView(withId(R.id.id_welcome_page_sign_email)).perform(ViewActions.typeText("john.doe@example.com"));
        Thread.sleep(500);

        // Step 5: Leave the 'Password' field empty
        // Step 6: Click on the 'CREATE A FREE ACCOUNT' button (Assuming id for create account button is R.id.id_welcome_page_sign_create_account)
        onView(withId(R.id.id_welcome_page_sign_create_account)).perform(click());
        Thread.sleep(500);

        // Expected Result: An error message should appear indicating that the password is required
        onView(withText("Password is required")).inRoot(withDecorView(not(activityRule.getActivity().getWindow().getDecorView()))).check(matches(isDisplayed()));
    }
}