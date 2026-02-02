package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10208_1020805 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRegisterWithGoogleNegativeFlow() throws InterruptedException {
        // Step 1: Open the 'buzzMuslim' app (Assuming it's already open, or this step is handled by setup)

        // Step 2: Click on the 'Register with Google' button
        Thread.sleep(500);
        onView(withId(R.id.id_register_google_btn)).perform(click());

        // Wait for a moment to ensure the error message appears
        Thread.sleep(500);

        // Expected Result: The user should not be redirected to the Google login page; an error message should be displayed.
        Espresso.onView(withText("Error")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}