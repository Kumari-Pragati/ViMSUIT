package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_18712_18712005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserClicksOnTheOkIUnderstandButtonWhileLocationServicesAreDisabled throws InterruptedException {
        // Step 1: Open the Weather Live app (Assuming it's already open)
        
        // Step 2: Navigate to the permission request page
        Espresso.onView(withText("Allow access to your location?")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Step 3: Click on the 'OK, I UNDERSTAND' button while location services are disabled
        Thread.sleep(500); // Wait for UI elements to load
        Espresso.onView(withId(R.id.id_understand)).perform(click());
        Thread.sleep(500); // Additional wait time
        
        // Expected Result: The user is denied permission to use location services, and the app displays a message indicating that location-based weather information cannot be provided.
        Espresso.onView(withText("Location Services are disabled")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}