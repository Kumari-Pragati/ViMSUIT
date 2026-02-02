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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class Test_18712_18712006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserClicksOnTheOkIUnderstandButtonWhileLocationServicesAreEnabled throws InterruptedException {
        // Step 1: Open the Weather Live app (Assuming it's already open)
        
        // Step 2: Navigate to the permission request page
        Thread.sleep(500); // Wait for the UI to load and show the permission dialog

        // Step 3: Click on the 'OK, I UNDERSTAND' button while location services are enabled
        onView(withId(R.id.id_understand)).perform(click());
        
        Thread.sleep(500); // Wait for the action to take effect
        
        // Expected Result: The user is granted permission and the app proceeds to the main screen with location-based weather information.
        // Here we assert that the main activity's view is not null, indicating the main screen has been reached
        assertThat(activityRule.getActivity().findViewById(R.id.main_weather_info), not(nullValue()));
    }
}