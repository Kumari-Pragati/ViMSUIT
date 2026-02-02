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

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1074_107403 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationVerifyAccountWithEmptyCode() throws InterruptedException {
        // Open the app and navigate to the account verification screen (assuming it's already open)
        
        // Step 2: Enter an empty verification code into the input field.
        onView(withId(R.id.id_smsCodeEditText2)).perform(ViewActions.clearText());
        
        Thread.sleep(500); // Wait for UI updates
        
        // Step 3: Tap the 'Continue' button
        Espresso.onView(withText("Continue")).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI updates
        
        // EXPECTED RESULT: An error message is displayed indicating that the code cannot be empty.
        onView(withId(R.id.id_smsCodeEditText2)).check(ViewAssertions.matches(withText("Please enter a valid verification code")));
    }
}