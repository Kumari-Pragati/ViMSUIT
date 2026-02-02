package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ScrollView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_10544_10544004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForNewCarsNegativeFlowNoResults() throws InterruptedException {
        // Step 1: Open the CarWale app (Assuming MainActivity is launched by default)
        
        // Step 2: Tap on the 'New Car' tab
        onView(withId(R.id.new_car_tab)).perform(click());
        Thread.sleep(500);

        // Step 3: Enter 'Luxury Cars' in the search input field
        onView(withId(R.id.search_input_field)).perform(typeText("Luxury Cars"));
        Thread.sleep(500);

        // Step 4: Tap on the 'FIND CAR' button
        onView(withId(R.id.find_car_button)).perform(click());
        Thread.sleep(500);

        // Expected Result: If no results are found, an appropriate message should be displayed.
        // Assuming the message is inside a ScrollView with id R.id.id_scrollView
        onView(withId(R.id.id_scrollView)).check(matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withText("No results found for Luxury Cars")).check(matches(isDisplayed()));
    }
}