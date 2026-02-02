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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_14804_14804002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowEnterInvalidPhoneNumberAndProceed() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Enter an invalid phone number in the text input field
        onView(withId(R.id.authorization_phone_input)).perform(clearText(), ViewActions.typeText("invalidPhoneNumber"));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Click the 'Next' button
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should display an error message or not proceed
        onView(withId(R.id.authorization_error_message)).check(matches(ViewMatchers.isDisplayed()));
    }
}