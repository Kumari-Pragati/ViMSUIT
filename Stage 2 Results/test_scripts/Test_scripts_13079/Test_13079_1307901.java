package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Test_13079_1307901 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndNavigateToTheVehiclesScreen() throws InterruptedException {
        // Step 1: Open the app (already done by ActivityTestRule)

        // Step 2: Navigate to the 'Vehicles' screen
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The 'Vehicles' screen is displayed
        onView(withText("Vehicles")).check(matches(isDisplayed()));
    }
}