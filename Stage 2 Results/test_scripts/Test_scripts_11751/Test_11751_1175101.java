package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.allOf;

public class Test_11751_1175101 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheDisplayOfBusRoutes() throws InterruptedException {
        // Open the app and navigate to the 'Bus Routes' screen.
        Espresso.onView(withId(R.id.id_listView1)).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify that all bus routes (Route 20, Route 22, Route 26, etc.) are displayed in the list.
        Espresso.onView(allOf(withText("Route 20"), isDisplayed())).check(ViewAssertions.matches(isDisplayed()));
        Espresso.onView(allOf(withText("Route 22"), isDisplayed())).check(ViewAssertions.matches(isDisplayed()));
        Espresso.onView(allOf(withText("Route 26"), isDisplayed())).check(ViewAssertions.matches(isDisplayed()));

        // Check if the route map for Route 22 is partially visible.
        Espresso.onView(allOf(withContentDescription("['Navigate up']"), isDisplayed()))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify that the route map for Route 22 is partially visible
        Espresso.onView(withId(R.id.route_map_22)).check(ViewAssertions.matches(isDisplayed()));
    }
}