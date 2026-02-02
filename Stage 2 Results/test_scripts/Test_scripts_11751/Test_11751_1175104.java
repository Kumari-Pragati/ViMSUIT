package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_11751_1175104 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForMissingBusRoutes() throws InterruptedException {
        // Navigate to the 'Bus Routes' screen and verify all expected bus routes are present

        // Element 1: withId(R.id.id_listView1)
        onView(withId(R.id.id_listView1))
                .perform(ViewActions.click())
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify that all expected bus routes (Route 20, Route 22, Route 26, etc.) are present
        String[] expectedRoutes = {"Route 20", "Route 22", "Route 26"};
        for (String route : expectedRoutes) {
            Espresso.onView(ViewMatchers.withText(route))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            Thread.sleep(500);
        }

        // Element 2: withContentDescription("['Navigate up']")
        onView(withContentDescription("['Navigate up']"))
                .perform(ViewActions.click())
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify that all expected bus routes are still present after navigating back
        for (String route : expectedRoutes) {
            Espresso.onView(ViewMatchers.withText(route))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            Thread.sleep(500);
        }
    }
}