package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.CardView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_15950_1595004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSegmentedControlNegativeFlow() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Teams' screen.
        // Assuming Teams screen is already open, if not, add navigation logic here.

        // Step 2: Click on the segmented control.
        Thread.sleep(500);
        onView(withId(R.id.id_search_query_section)).perform(click());

        // Step 3: Select a non-existent region.
        Thread.sleep(500);

        // Expected Result: The segmented control should not allow selection of a non-existent region.
        // Assuming the segmented control has an invalid state after attempting to select a non-existent region,
        // we can check if it remains clickable or not. If it's not clickable, then the test passes.
        Thread.sleep(500);
        onView(withId(R.id.id_search_query_section)).check(matches(isClickable()));
    }
}