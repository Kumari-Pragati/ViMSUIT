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
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_11960_1196002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEnterInvalidPhoneNumberAndContinue throws InterruptedException {
        // Step 1: Open the app and navigate to the phone number entry screen.
        
        // Step 2: Select the country 'United States (+1)' from the list. (Assuming this is handled by Espresso actions)
        
        // Step 3: Enter the phone number '123-456-789' in the input field.
        onView(withId(R.id.id_numberField)).perform(ViewActions.typeText("123-456-789"));
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Tap the 'CONTINUE' button. (Assuming this is a Button with id R.id.continueButton)
        onView(withId(R.id.continueButton)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should display an error message indicating an invalid phone number.
        onView(ViewMatchers.withText("Invalid phone number")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}