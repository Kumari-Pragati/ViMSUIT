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
public class Test_15697_15697004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(30000);

    @Test
    public void testVerifyPhoneNumberTogglesState() throws InterruptedException {
        // Open the app (Assuming it's already open and on the main activity)
        
        // Navigate to the Offers screen
        onView(withText("Offers")).perform(click());
        Thread.sleep(500);
        
        // Click on the 'Verify' button
        onView(withId(R.id.id_verify_btn)).perform(click());
        Thread.sleep(500);
        
        // Enter a valid phone number with 10 digits (Assuming there's an input field for this)
        onView(withId(R.id.phone_number_input)).perform(ViewActions.typeText("1234567890"));
        Thread.sleep(500);
        
        // Submit the phone number
        Espresso.closeSoftKeyboard();
        Thread.sleep(500);
        
        // Check if the 'Verify' button changes to 'Resend Code'
        onView(withId(R.id.id_verify_btn)).check(matches(withText("Resend Code")));
    }
}