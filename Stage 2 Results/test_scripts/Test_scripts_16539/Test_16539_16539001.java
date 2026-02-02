package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_16539_16539001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveRegistrationFlowWithValidInputs() throws InterruptedException {
        // Step 2: Navigate to the registration screen (Assuming it's already on the registration screen)
        
        // Step 3: Enter the mobile number '4155791638' in the input field
        onView(withId(R.id.id_edtMdn)).perform(typeText("4155791638"), clearText(), typeText("4155791638"));
        Thread.sleep(500);

        // Step 4: Enter the username 'Appcrawler' in the input field
        onView(withId(R.id.id_edtUsername)).perform(typeText("Appcrawler"));
        Thread.sleep(500);

        // Step 5: Enter the first OTP '123456' in the input field
        onView(withId(R.id.id_otpField1)).perform(typeText("123456"));
        Thread.sleep(500);

        // Step 6: Enter the second OTP '123456' in the input field
        onView(withId(R.id.id_otpField2)).perform(typeText("123456"));
        Thread.sleep(500);

        // Step 7: Click on the 'CONFIRM' button
        onView(withId(R.id.id_btnConfirm)).perform(click());
        Thread.sleep(500);

        // Expected Result: The app should display a success message indicating the registration is complete.
        // Assuming there's an ID for the success message, e.g., R.id.successMessage
        onView(withText("Registration successful!")).inRoot(isDialog()).check(matches(withText("Registration successful!")));
        
        // Expected Result: The user should be redirected to the account details page.
        // Assuming there's a view or text that indicates the account details page is loaded, e.g., R.id.accountDetails
        onView(withId(R.id.accountDetails)).check(matches(isDisplayed()));
    }
}