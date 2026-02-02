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

@RunWith(JUnit4.class)
public class Test_18869_18869007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowCreateANewAccountWithExistingEmail throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Click on the 'NEW ACCOUNT' title
        onView(ViewMatchers.withText("NEW ACCOUNT")).perform(ViewActions.click());

        // Step 3: Enter an existing email address into the 'EMAIL' input field
        onView(withId(R.id.email_input)).perform(ViewActions.typeText("existing@example.com"));

        // Step 4: Click on the 'CREATE ACCOUNT' button
        Thread.sleep(500);
        onView(withId(R.id.id_reset_pass)).perform(ViewActions.click());

        // Expected Result: The app should display an error message indicating the email is already in use
        Thread.sleep(500);
        onView(withText("Email already in use")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}