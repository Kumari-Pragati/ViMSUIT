package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;

public class Test_15891_15891001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowEnterAddressAndUseCurrentLocation() throws InterruptedException {
        // Step 1: Click on the search bar and type '123 Main St'.
        EditText searchBar = (EditText) Espresso.onView(ViewMatchers.withId(R.id.search_bar))
                .perform(ViewActions.typeText("123 Main St"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .await()
                .getBlockingResult();

        Thread.sleep(500);

        // Step 2: Click on the 'USE MY CURRENT LOCATION' button.
        Espresso.onView(ViewMatchers.withContentDescription("['Outdated Version']"))
                .perform(ViewActions.click());

        Thread.sleep(500);

        // Expected Result: The app should display nearby food options based on the entered address or current location.
        Button useCurrentLocationButton = (Button) Espresso.onView(ViewMatchers.withId(R.id.use_current_location_button))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .await()
                .getBlockingResult();

        // Assuming there is a view that indicates nearby food options are displayed
        Espresso.onView(ViewMatchers.withText("Nearby Food Options"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}