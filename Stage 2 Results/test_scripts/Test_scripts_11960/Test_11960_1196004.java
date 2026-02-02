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
import org.junit.runners.JUnit4;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_11960_1196004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationEnterMaximumLengthPhoneNumberAndContinue() throws InterruptedException {
        // Step 1: Open the app and navigate to the phone number entry screen.
        
        // Step 2: Select the country 'United States (+1)' from the list. (Assuming this is handled by a separate step or UI interaction)
        
        // Step 3: Enter the phone number '12345678901234567890' in the input field.
        onView(withId(R.id.id_numberField)).perform(ViewActions.typeText("12345678901234567890"));
        
        // Step 4: Tap the 'CONTINUE' button.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(click());
        
        // Wait for a moment to ensure the error message is displayed
        Thread.sleep(500);
        
        // Expected Result: The app should display an error message indicating an invalid phone number.
        onView(withText("Invalid phone number")).inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(Button.class))).check(matches(isDisplayed()));
    }
}