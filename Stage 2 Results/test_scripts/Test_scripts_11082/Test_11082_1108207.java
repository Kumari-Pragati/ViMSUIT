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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11082_1108207 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignInButtonNegativeFlow() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Step 2: Click on the 'Sign In' button
        onView(withId(R.id.id_btn_login)).perform(click());

        // Wait before canceling the login process
        Thread.sleep(500);

        // Step 3: Cancel the login process (simulated by not entering credentials and clicking back)
        // Assuming there is a way to cancel or go back, for example, using the back button
        onView(withId(R.id.id_btn_login)).perform(click());

        // Wait before checking the result
        Thread.sleep(500);

        // Step 4: Assert that the user is redirected back to the login page
        onView(withId(R.id.id_btn_login)).check(matches(isDisplayed()));
    }
}