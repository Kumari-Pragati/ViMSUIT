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
public class Test_1130_113001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testUserNavigatesToTheModalScreenAndSelectsUnlockFullAccess() throws InterruptedException {
        // Step 1: Open the ScholarshipApp and navigate to the modal screen.
        // Assuming that navigating to the modal screen is already done by default in MainActivity

        // Step 2: Click on the 'UNLOCK FULL ACCESS' option in the pop-up window.
        Thread.sleep(500);
        onView(withId(R.id.id_upgrade_btn_unlock)).perform(click());

        // Step 3: Enter the required payment information to unlock full access.
        // Assuming that entering payment information is done through a series of actions
        Thread.sleep(500);

        // Expected Result: The user is redirected to the payment confirmation screen.
        // Assuming that after clicking, we should see some text indicating success or redirection
        onView(withText("Payment Confirmation")).check(matches(isDisplayed()));

        // Additional assertion for successful selection
        onView(withId(R.id.id_upgrade_btn_unlock)).check(matches(not(isClickable())));
    }
}