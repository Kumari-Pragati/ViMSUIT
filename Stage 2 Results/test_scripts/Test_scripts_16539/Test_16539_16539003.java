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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;

@RunWith(AndroidJUnit4.class)
public class Test_16539_16539003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowWithInvalidMobileNumber() throws InterruptedException {
        // Step 1: Open the InstaCare app (Assuming it's already open)
        
        // Step 2: Navigate to the registration screen
        onView(withId(R.id.registration_screen)).perform(ViewActions.click());

        // Step 3: Enter the mobile number '123456789' in the input field
        Thread.sleep(500);
        onView(withId(R.id.id_edtMdn)).perform(ViewActions.typeText("123456789"));

        // Step 4: Enter the username 'Appcrawler' in the input field
        Thread.sleep(500);
        onView(withId(R.id.id_username_input)).perform(ViewActions.typeText("Appcrawler"));

        // Step 5: Enter the first OTP '123456' in the input field
        Thread.sleep(500);
        onView(withId(R.id.id_otp_first)).perform(ViewActions.typeText("123456"));

        // Step 6: Enter the second OTP '123456' in the input field
        Thread.sleep(500);
        onView(withId(R.id.id_otp_second)).perform(ViewActions.typeText("123456"));

        // Step 7: Click on the 'CONFIRM' button
        Thread.sleep(500);
        Espresso.onView(withId(R.id.confirm_button)).perform(ViewActions.click());

        // Expected Result: The app should display an error message indicating that the mobile number is invalid
        Thread.sleep(500);
        onView(withText(containsString("Invalid mobile number"))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}