package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17105_17105003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheFloorPlansAndPricingSection() throws InterruptedException {
        // Open the property listing for Thompson St #6.
        Espresso.onView(withId(R.id.property_list_item_thompson_st_6)).perform(ViewActions.click());

        // Tap on the 'Floor Plans and Pricing' section.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_floorplan_list)).perform(ViewActions.click());

        // Wait for 500ms to ensure navigation is complete
        Thread.sleep(500);

        // Assert that the floor plans and pricing section is displayed
        Espresso.onView(withId(R.id.id_floorplan_list)).check(matches(isDisplayed()));
    }
}