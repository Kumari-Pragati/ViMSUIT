package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_18254_18254001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAddVehicleScreen() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Click on the 'OK' button to navigate to the Add vehicle screen
        onView(withId(R.id.id_buttonDefaultPositive)).perform(click());
        
        // Wait before checking if the Add vehicle screen is displayed
        Thread.sleep(500);
        
        // Assert that the Add vehicle screen is displayed
        onView(withId(R.id.add_vehicle_screen_container)).check(matches(isDisplayed()));
    }
}