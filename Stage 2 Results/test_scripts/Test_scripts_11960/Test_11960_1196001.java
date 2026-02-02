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
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(JUnit4.class)
public class Test_11960_1196001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowEnterValidPhoneNumberAndContinue throws InterruptedException {
        // Step 1: Open the app and navigate to the phone number entry screen.
        // Assuming the app navigates directly to this screen on launch

        // Step 2: Select the country 'United States (+1)' from the list
        // This step is assumed as it's not specified how to select a country, so we skip it for now.

        // Step 3: Enter the phone number '123-456-7890' in the input field.
        Espresso.onView(withId(R.id.id_phone_number_input)).perform(ViewActions.typeText("123-456-7890"));

        // Step 4: Tap the 'CONTINUE' button
        Thread.sleep(500);
        Espresso.onView(allOf(
                withId(R.id.id_wizard_next),
                withText("CONTINUE")
        )).perform(ViewActions.click());

        // Step 5: Wait for a moment to ensure the next screen is loaded
        Thread.sleep(500);

        // Expected Result: The app should display a confirmation message or proceed to the next screen.
        Espresso.onView(withId(R.id.id_confirmation_message)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}