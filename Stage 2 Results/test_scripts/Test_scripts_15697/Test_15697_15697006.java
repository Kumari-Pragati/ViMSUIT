package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_15697_15697006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyPhoneNumberCheckBoxes() throws InterruptedException {
        // Step 1: Open the app (Assuming MainActivity is launched by default)
        
        // Step 2: Navigate to the Offers screen
        Espresso.onView(allOf(withId(R.id.id_offers_screen), withText("Offers"))).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Click on the 'Verify' button
        Espresso.onView(withId(R.id.id_verify_phone)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 4: Enter a valid phone number with 10 digits (Assuming EditText for phone number is available)
        Espresso.onView(withId(R.id.id_phone_number_input)).perform(ViewActions.typeText("1234567890"));
        Thread.sleep(500);

        // Step 5: Submit the phone number
        Espresso.onView(withId(R.id.id_submit_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result Assertions
        // User is redirected to a verification page
        Espresso.onView(allOf(withId(R.id.id_verification_page), withText("Verification Page"))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // User receives a verification code (Assuming this step involves some network interaction or UI change)
        // For simplicity, we assume the next screen is shown after submitting the phone number
        Espresso.onView(allOf(withId(R.id.id_verification_code_input), withText("Verification Code"))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // User can view current offers after verification (Assuming Offers screen is back)
        Espresso.onView(allOf(withId(R.id.id_offers_screen), withText("Offers"))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}