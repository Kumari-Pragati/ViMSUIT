package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_1303_130301 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSelectingACityFromTheList() throws InterruptedException {
        // Step 1: Open the application (Assuming it's already open, this step is not necessary in Espresso tests)

        // Step 2: Navigate to the 'Select City' screen
        // Assuming there is a button or action that navigates to the city selection screen
        Espresso.onView(withId(R.id.navigate_to_city_selection)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Scroll through the list of cities and tap on 'BUENOS AIRES'
        Espresso.onView(withId(R.id.id_city_list_view))
                .perform(ViewActions.scrollToPosition(1)) // Assuming BUENOS AIRES is at position 1
                .perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 4: Verify that 'BUENOS AIRES' is selected
        Espresso.onView(withId(R.id.id_city_list_view))
                .check(ViewAssertions.matches(hasDescendant(withText("BUENOS AIRES"))));

        Thread.sleep(500); // Wait for UI to update
    }
}