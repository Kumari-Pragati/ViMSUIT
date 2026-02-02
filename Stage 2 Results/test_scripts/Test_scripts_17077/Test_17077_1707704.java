package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Spinner;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_17077_1707704 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Initial setup if needed
    }

    @Test
    public void testToggleStateVerifyTheFilterSectionTogglesCorrectly throws InterruptedException {
        // Step 1: Open the Gluten-Free app.
        // Step 2: Navigate to the list of gluten-free takeaway restaurants. (Assuming this is done in the activity)

        // Step 3: Click on the 'Place Type' dropdown.
        onView(withId(R.id.id_spinnerPlaceType)).perform(click());
        Thread.sleep(500);

        // Step 4: Select 'Takeaway'.
        onView(withText("Takeaway")).perform(click());
        Thread.sleep(500);

        // Step 5: Click on the 'Cuisine' dropdown.
        onView(withId(R.id.id_spinnerCuisine)).perform(click());
        Thread.sleep(500);

        // Step 6: Select 'Gluten-Free'.
        onView(withText("Gluten-Free")).perform(click());
        Thread.sleep(500);

        // Step 7: Click on the 'Sort' dropdown.
        onView(withId(R.id.id_spinnerSort)).perform(click());
        Thread.sleep(500);

        // Step 8: Select 'Rating'.
        onView(withText("Rating")).perform(click());
        Thread.sleep(500);

        // Step 9: Verify that the list updates to show only gluten-free takeaway restaurants sorted by rating.
        Espresso.onView(ViewMatchers.isRoot()).check(matches(ViewMatchers.hasDescendant(
                withText("Takeaway").inRoot(hasSibling(withText("Gluten-Free"))))));
        Thread.sleep(500);

        // Step 10: Click on the 'Place Type' dropdown.
        onView(withId(R.id.id_spinnerPlaceType)).perform(click());
        Thread.sleep(500);

        // Step 11: Select 'All'.
        onView(withText("All")).perform(click());
        Thread.sleep(500);

        // Step 12: Click on the 'Cuisine' dropdown.
        onView(withId(R.id.id_spinnerCuisine)).perform(click());
        Thread.sleep(500);

        // Step 13: Select 'Gluten-Free'.
        onView(withText("Gluten-Free")).perform(click());
        Thread.sleep(500);

        // Step 14: Click on the 'Sort' dropdown.
        onView(withId(R.id.id_spinnerSort)).perform(click());
        Thread.sleep(500);

        // Step 15: Select 'Rating'.
        onView(withText("Rating")).perform(click());
        Thread.sleep(500);

        // Step 16: Verify that the list updates to show all gluten-free takeaway restaurants sorted by rating.
        Espresso.onView(ViewMatchers.isRoot()).check(matches(ViewMatchers.hasDescendant(
                withText("Gluten-Free").inRoot(hasSibling(withText("Rating"))))));
    }
}