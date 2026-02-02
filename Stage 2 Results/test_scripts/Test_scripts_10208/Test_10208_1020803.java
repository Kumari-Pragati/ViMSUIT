package com.example.tests;

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
public class Test_10208_1020803 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRegisterWithEmailAddressPositiveFlow() throws InterruptedException {
        // Step 1: Open the 'buzzMuslim' app (Assuming it's already open, this step is implicit)

        // Step 2: Click on the 'Register with Email Address' button
        Thread.sleep(500);
        onView(withId(R.id.id_register_email_btn)).perform(click());

        // Expected Result: The user should be redirected to the email registration form
        Thread.sleep(500);
        onView(withText("Email")).check(matches(isDisplayed()));
    }
}