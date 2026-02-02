package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_10208_1020806 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRegisterWithEmailAddressNegativeFlow throws InterruptedException {
        // Step 1: Open the 'buzzMuslim' app (Assuming it's already open, this step is implicit)

        // Step 2: Click on the 'Register with Email Address' button
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.id_register_email_btn)).perform(click());

        // Expected Result: The user should not be redirected to the email registration form; an error message should be displayed.
        Thread.sleep(500); // Wait for UI to update with potential error message
        onView(isDisplayed()).inRoot(isDialog()).check(ViewAssertions.matches(isDisplayed()));

        Espresso.pressBack(); // Go back to previous screen if needed
    }
}