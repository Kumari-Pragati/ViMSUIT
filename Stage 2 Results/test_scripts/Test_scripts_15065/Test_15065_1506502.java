package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_15065_1506502 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testNegativeFlowInvalidInputInDropdowns() throws InterruptedException {
        // Step 1: Open the app and navigate to the Contacts settings page.
        // Assuming the main activity has a method to open the settings page
        Espresso.onView(withId(R.id.openSettingsButton)).perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Select an invalid option from the 'Days or Weeks' dropdown.
        Espresso.onView(allOf(withId(R.id.id_UseWeeks), isDisplayed()))
                .perform(click());
        Espresso.onData(withText("Invalid Option"))
                .inAdapterView(withId(R.id.id_UseWeeks))
                .perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Select an invalid option from the 'Display Name' dropdown.
        Espresso.onView(allOf(withId(R.id.id_DisplayName), isDisplayed()))
                .perform(click());
        Espresso.onData(withText("Invalid Display Name"))
                .inAdapterView(withId(R.id.id_DisplayName))
                .perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app displays an error message for invalid input in the 'Days or Weeks' dropdown.
        Espresso.onView(allOf(withId(R.id.error_message), isDisplayed()))
                .check(ViewAssertions.matches(withText("Invalid input selected")));

        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app displays an error message for invalid input in the 'Display Name' dropdown.
        Espresso.onView(allOf(withId(R.id.error_message), isDisplayed()))
                .check(ViewAssertions.matches(withText("Invalid display name selected")));
    }
}