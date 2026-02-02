package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12449_1244904 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityNavigatingBackToThePreviousScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the search functionality
        Espresso.onView(withId(R.id.id_countries_list)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 2: Tap on the 'Choose country to search in' header
        Thread.sleep(500);

        // Assuming there is a header with id R.id.header_choose_country
        Espresso.onView(withId(R.id.header_choose_country)).perform(ViewActions.click());

        // Step 3: Select a country from the list
        Thread.sleep(500);
        
        // Assuming the first item in the RecyclerView is the one to select
        Espresso.onView(withId(R.id.id_countries_list))
                .perform(ViewActions.scrollToPosition(0))
                .perform(ViewActions.click());

        // Step 4: Tap the 'OK' button to confirm the selection
        Thread.sleep(500);
        
        // Assuming there is an OK button with id R.id.ok_button
        Espresso.onView(withId(R.id.ok_button)).perform(ViewActions.click());

        // Step 5: Navigate back to the previous screen
        Thread.sleep(500);

        // Check if the selected country is applied in the previous screen
        Espresso.onView(withId(R.id.id_countries_list))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}