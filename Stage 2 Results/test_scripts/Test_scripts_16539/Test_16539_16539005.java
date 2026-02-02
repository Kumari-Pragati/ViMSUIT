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
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_16539_16539005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowWithInvalidUsername() throws InterruptedException {
        // Step 1: Open the InstaCare app (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the registration screen
        onView(withId(R.id.id_edtUsername)).perform(typeText("Appcrawler123"));
        Thread.sleep(500);

        // Step 3: Enter the mobile number '4155791638' in the input field (Assuming it's another EditText)
        onView(withId(R.id.id_mobileNumberInput)).perform(typeText("4155791638"));
        Thread.sleep(500);

        // Step 4: Enter the username 'Appcrawler123' in the input field
        onView(withId(R.id.id_edtUsername)).perform(clearText(), typeText("Appcrawler123"));
        Thread.sleep(500);

        // Step 5: Enter the first OTP '123456' in the input field (Assuming it's another EditText)
        onView(withId(R.id.id_otpInput1)).perform(typeText("123456"));
        Thread.sleep(500);

        // Step 6: Enter the second OTP '123456' in the input field
        onView(withId(R.id.id_otpInput2)).perform(typeText("123456"));
        Thread.sleep(500);

        // Step 7: Click on the 'CONFIRM' button (Assuming it's a Button)
        Espresso.onView(withText("CONFIRM")).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: The app should display an error message indicating that the username is invalid
        onView(withText("Invalid Username")).inRoot(withDecorView(not(activityRule.getActivity().getWindow().getDecorView()))).check(matches(isDisplayed()));
    }
}