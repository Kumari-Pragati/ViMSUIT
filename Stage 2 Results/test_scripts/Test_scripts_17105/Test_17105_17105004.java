package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;

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
public class Test_17105_17105004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFloorPlanDetails() throws InterruptedException {
        // Step 1: Open the property listing for Thompson St #6.
        onView(withText("Thompson St #6")).perform(click());
        Thread.sleep(500);

        // Step 2: Navigate to the floor plans and pricing section.
        onView(withId(R.id.id_floorplan_list)).perform(ViewActions.scrollTo(), click());
        Thread.sleep(500);

        // Step 3: Verify that the floor plan details are '1 bed / 1 bath', '0 sq ft', and '$2750'.
        onView(withText("1 bed / 1 bath")).check(matches(isDisplayed()));
        Thread.sleep(500);
        onView(withText("0 sq ft")).check(matches(isDisplayed()));
        Thread.sleep(500);
        onView(withText("$2750")).check(matches(isDisplayed()));

        // Additional assertion to ensure all details are visible
        Espresso.onView(ViewMatchers.withParent(withId(R.id.id_floorplan_list)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}