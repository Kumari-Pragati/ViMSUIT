package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_1303_130302 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowAttemptingToSelectANonexistentCity() throws InterruptedException {
        // Open the application (already done by ActivityTestRule)

        // Navigate to the 'Select City' screen
        Espresso.onView(withId(R.id.id_city_list_view)).perform(click());
        Thread.sleep(500); // Wait for the list view to be fully loaded

        // Scroll through the list of cities and tap on a non-existent city name
        Espresso.onView(withId(R.id.id_city_list_view)).perform(ViewActions.scrollToPosition(10)); // Assuming 10 is beyond the actual number of items
        Thread.sleep(500); // Wait for scrolling to complete

        Espresso.onView(withId(R.id.id_city_list_view)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for click action to be processed

        // Verify that an error message is displayed indicating the city does not exist
        Espresso.onView(ViewMatchers.withText("City Not Found"))
                .inRoot(ViewMatchers.withParent(ListView.class))
                .check(ViewAssertions.matches(isDisplayed()));
    }
}