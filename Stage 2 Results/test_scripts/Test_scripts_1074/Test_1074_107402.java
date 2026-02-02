package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_1074_107402 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowVerifyAccountWithIncorrectCode throws InterruptedException {
        // Step 1: Open the app and navigate to the account verification screen.
        // Assuming that the account verification screen is already open or can be navigated directly.

        // Step 2: Enter an incorrect verification code into the input field.
        onView(withId(R.id.id_smsCodeEditText2)).perform(ViewActions.typeText("123456"));

        // Step 3: Tap the 'Continue' button.
        Thread.sleep(500); // Wait for UI to update

        Espresso.onView(ViewMatchers.withId(R.id.continueButtonId)).perform(ViewActions.click());

        // Expected Result: An error message is displayed indicating that the code is incorrect.
        Thread.sleep(500); // Wait for UI to update
        onView(ViewMatchers.withText("Incorrect verification code")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}