package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_16539_16539004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowWithEmptyUsername() throws InterruptedException {
        // Step 2: Navigate to the registration screen (Assuming it's already on the registration screen)
        
        // Step 3: Enter the mobile number '4155791638' in the input field.
        onView(withId(R.id.id_edtMobileNumber)).perform(typeText("4155791638"), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Step 4: Enter the username '' in the input field.
        onView(withId(R.id.id_edtUsername)).perform(clearText(), typeText(""), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Step 5: Enter the first OTP '123456' in the input field.
        onView(withId(R.id.id_otpField1)).perform(typeText("123456"), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Step 6: Enter the second OTP '123456' in the input field.
        onView(withId(R.id.id_otpField2)).perform(typeText("123456"), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Step 7: Click on the 'CONFIRM' button.
        Espresso.onView(ViewMatchers.withText("CONFIRM")).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: The app should display an error message indicating that the username is required.
        onView(withId(R.id.id_errorUsername)).check(matches(ViewMatchers.isDisplayed()));
    }
}