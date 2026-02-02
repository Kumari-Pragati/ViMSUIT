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

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15697_15697002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testVerifyPhoneNumberNegativeFlow() throws InterruptedException {
        // Step 1: Open the app (Assuming it's already open, or this step is handled by ActivityTestRule)

        // Step 2: Navigate to the Offers screen
        Espresso.onView(withText("Offers")).perform(ViewActions.click());

        // Step 3: Click on the 'Verify' button
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_verify_phone)).perform(ViewActions.click());

        // Step 4: Enter an invalid phone number
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_verify_phone)).perform(ViewActions.typeText("123456789"));

        // Step 5: Submit the invalid phone number
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_verify_phone)).perform(ViewActions.closeSoftKeyboard());
        Espresso.onView(withId(R.id.id_verify_phone)).perform(ViewActions.click());

        // Expected Result: User is not redirected to a verification page and receives an error message
        Thread.sleep(500);
        Espresso.onView(withText("Invalid phone number")).check(ViewAssertions.matches(isDisplayed()));

        // Expected Result: User cannot view current offers
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_offers_list)).check(ViewAssertions.doesNotExist());
    }
}