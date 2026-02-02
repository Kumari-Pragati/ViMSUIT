package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatButton;
import org.junit.Rule;
import org.junit.Test;

public class Test_18869_18869005 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowCreateANewAccountWithTooLongEmail throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Click on the 'NEW ACCOUNT' title
        onView(ViewMatchers.withText("NEW ACCOUNT")).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Enter a very long email address into the 'EMAIL' input field
        String tooLongEmail = "a".repeat(256); // Email length limit is typically around 254 characters, so we add extra to ensure it's too long
        onView(ViewMatchers.withId(R.id.email_input)).perform(ViewActions.typeText(tooLongEmail));
        Thread.sleep(500);

        // Step 4: Click on the 'CREATE ACCOUNT' button
        onView(withId(R.id.id_reset_pass)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: The app should display an error message indicating the email is too long
        onView(ViewMatchers.withText("Email must be less than 254 characters")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}