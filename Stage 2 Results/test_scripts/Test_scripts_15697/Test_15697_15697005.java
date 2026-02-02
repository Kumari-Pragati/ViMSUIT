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

@RunWith(AndroidJUnit4.class)
public class Test_15697_15697005 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testVerifyPhoneNumberClickableButtons() throws InterruptedException {
        // Step 1: Open the app (Assuming it's already open, or you can add an intent to launch MainActivity)

        // Step 2: Navigate to the Offers screen (Assuming there is a navigation mechanism)
        Espresso.onView(withId(R.id.nav_offers)).perform(ViewActions.click());

        // Step 3: Click on the 'Verify' button
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_verify_phone)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withId(R.id.id_verify_phone)).perform(ViewActions.click());

        // Step 4: Enter a valid phone number with 10 digits (Assuming there is an input field for the phone number)
        Thread.sleep(500);
        Espresso.onView(withId(R.id.phone_number_input)).perform(ViewActions.typeText("1234567890"));

        // Step 5: Submit the phone number
        Thread.sleep(500);
        Espresso.onView(withId(R.id.submit_phone_number_button)).perform(ViewActions.click());

        // Step 6: Click on the 'Resend Code' button (Assuming there is a resend code button)
        Thread.sleep(500);
        Espresso.onView(withId(R.id.resend_code_button)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withId(R.id.resend_code_button)).perform(ViewActions.click());

        // Expected Result Assertions
        // Assuming the verification page is displayed and user can view current offers after verification
        Thread.sleep(500);
        Espresso.onView(withText("Verification Page")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withText("Current Offers")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
```

Note: The resource IDs `R.id.phone_number_input` and `R.id.submit_phone_number_button`, as well as the text "Verification Page" and "Current Offers", are placeholders. You should replace them with actual resource IDs and texts from your application's UI elements.