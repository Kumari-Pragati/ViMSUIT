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

@RunWith(JUnit4.class)
public class Test_12449_1244901 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSelectingACountryAndConfirmingTheSelection() throws InterruptedException {
        // Step 1: Open the app and navigate to the search functionality
        Espresso.onView(ViewMatchers.withId(R.id.id_countries_list)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 2: Tap on the 'Choose country to search in' header
        Espresso.onView(ViewMatchers.withText("Choose country to search in")).perform(ViewActions.click());

        // Step 3: Select a country from the list of countries (assuming first item is selected)
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_countries_list)).perform(ViewActions.scrollToPosition(1));
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Country Name")).perform(ViewActions.click());

        // Step 4: Tap the 'OK' button to confirm the selection
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.ok_button)).perform(ViewActions.click());

        // Expected Result: The selected country is confirmed and the app returns to the previous screen
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Country Name")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}