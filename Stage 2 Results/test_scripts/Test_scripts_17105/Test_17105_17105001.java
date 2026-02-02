package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17105_17105001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenThePropertyListingForThompsonSt() throws InterruptedException {
        // Step 1: Open the RealEstateApp.
        
        // Step 2: Navigate to the property listing for Thompson St #6.
        Thread.sleep(500); // Wait for UI to load
        
        // Interaction with the button
        onView(withId(R.id.id_check_availability_button)).performClick();
        Thread.sleep(500); // Wait before checking if the property listing is displayed

        // Expected result: The property listing for Thompson St #6 is displayed.
        onView(withId(R.id.property_listings_container)).check(matches(isDisplayed()));
    }
}