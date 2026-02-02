package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class Test_12504_1250406 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewThePriceOfTheEssentialsBundle() throws InterruptedException {
        // Wait for the RecyclerView to be displayed
        Espresso.onView(ViewMatchers.withId(R.id.id_BundleDetailsLandingRecyclerView))
                .check(matches(isDisplayed()));

        // Scroll down to view the price '$35.95/month'
        Thread.sleep(500); // Add a delay to ensure the UI is updated

        // Perform the scroll action
        Espresso.onView(ViewMatchers.withId(R.id.id_BundleDetailsLandingRecyclerView))
                .performScrollToPosition(1); // Assuming 1 is the position of the price in the RecyclerView

        Thread.sleep(500); // Add a delay to ensure the UI is updated after scrolling

        // Check if the price '$35.95/month' is displayed
        Espresso.onView(ViewMatchers.withText("$35.95/month"))
                .check(matches(isDisplayed()));
    }
}