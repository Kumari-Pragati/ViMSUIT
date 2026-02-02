package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_1074_107404 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testToggleStateVerifyAccountWithValidCode() throws InterruptedException {
        // Step 1: Open the app and navigate to the account verification screen.
        // Assuming the verification screen is already open, if not, add navigation steps here.

        // Step 2: Enter a valid verification code into the input field.
        onView(withId(R.id.id_smsCodeEditText2)).perform(ViewActions.typeText("123456"));

        // Step 3: Tap the 'Continue' button.
        Thread.sleep(500);
        Espresso.onView(withText("Continue")).perform(click());

        // Step 4: Tap the 'Continue' button again after receiving a confirmation message.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_continueButton)).check(matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withId(R.id.id_continueButton)).perform(click());

        // Expected Result: The user is redirected to the next verification step or the account is verified successfully.
        Thread.sleep(500);
        Espresso.onView(withText("Verification successful")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}