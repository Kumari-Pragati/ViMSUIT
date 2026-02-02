package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Before;
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
public class Test_1074_107401 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    private Button continueButton;

    @Before
    public void setUp() {
        // Initialize the continue button for later use
        continueButton = activityTestRule.getActivity().findViewById(R.id.id_continueButton);
    }

    @Test
    public void testPositiveFlowVerifyAccountWithCorrectCode throws InterruptedException {
        // Step 1: Open the app and navigate to the account verification screen.
        // Assuming the verification screen is already open or can be navigated directly.

        // Step 2: Enter the correct verification code into the input field.
        onView(withId(R.id.id_smsCodeEditText2)).perform(ViewActions.typeText("123456"));

        // Step 3: Tap the 'Continue' button.
        continueButton.perform(click());

        // Wait for 500ms to ensure the action is processed
        Thread.sleep(500);

        // Expected Result: The user is redirected to the next verification step or the account is verified successfully.
        // Assuming there's a TextView with id R.id.id_verificationStatusTextView that shows the status of the verification
        onView(withId(R.id.id_verificationStatusTextView)).check(matches(withText("Verification successful")));

        // Additional assertion for navigation to next screen can be added here if needed
    }
}