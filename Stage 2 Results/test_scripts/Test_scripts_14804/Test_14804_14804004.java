package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_14804_14804004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyInputFieldAndProceed throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Enter an empty phone number in the text input field
        onView(withId(R.id.authorization_phone_input)).perform(ViewActions.clearText());

        // Step 3: Click the 'Next' button
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click());
        
        // Wait for a moment to ensure the error message is displayed
        Thread.sleep(500);

        // Expected Result: The app should display an error message or not proceed
        onView(withId(R.id.error_message)).check(matches(withText("Please enter a valid phone number")));
    }
}