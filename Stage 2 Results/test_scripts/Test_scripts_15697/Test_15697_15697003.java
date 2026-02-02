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
public class Test_15697_15697003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(20000);

    @Test
    public void testVerifyPhoneNumberBoundaryValidation() throws InterruptedException {
        // Open the app (Assuming MainActivity is launched by default)
        
        // Navigate to the Offers screen
        onView(withText("Offers")).perform(click());
        Thread.sleep(500);
        
        // Click on the 'Verify' button
        onView(withId(R.id.id_verify_phone)).perform(click());
        Thread.sleep(500);
        
        // Enter a valid phone number with 10 digits
        onView(withId(R.id.id_verify_phone)).perform(ViewActions.typeText("1234567890"));
        Thread.sleep(500);
        
        // Submit the phone number
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.id_verify_phone)).perform(click());
        Thread.sleep(500);

        // Expected result: User is redirected to a verification page
        onView(withText("Verification Page")).check(matches(isDisplayed()));
        Thread.sleep(500);
        
        // Expected result: User receives a verification code (Assuming this step involves network interaction)
        // For demonstration, we will assert that the next screen is displayed
        onView(withText("Enter Verification Code")).check(matches(isDisplayed()));
        Thread.sleep(500);
        
        // Expected result: User can view current offers after verification
        onView(withText("Current Offers")).check(matches(isDisplayed()));
    }
}