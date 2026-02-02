package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class Test_13565_13565007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDataPersistencePropertyDetailsPersistence() throws InterruptedException {
        // Step 1: Open the app and navigate to the screen displaying rental properties in Koramangala.
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500); // Wait for drawer to open

        // Assuming there is a navigation item for "Koramangala" that needs to be clicked
        onView(withText("Koramangala")).perform(click());
        Thread.sleep(500); // Wait for the properties screen to load

        // Step 2: Click on a property listing to view more details.
        onView(withId(R.id.property_list_item)).perform(click());
        Thread.sleep(500); // Wait for the property detail screen to load

        // Step 3: Close the app and reopen it to verify that the property details are still persisted.
        activityRule.finishActivity();
        Thread.sleep(1000); // Wait before reopening the app
        activityRule.launchActivity(null);

        // Verify that the property details are still displayed after reopening the app
        onView(withId(R.id.property_list_item)).check(matches(isDisplayed()));
    }
}