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

@RunWith(AndroidJUnit4.class)
public class Test_18712_18712002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserDeniesPermissionToUseLocationServices() throws InterruptedException {
        // Step 1: Open the Weather Live app (Assuming it's already opened by ActivityTestRule)
        
        // Step 2: Navigate to the permission request page
        Espresso.onView(ViewMatchers.withText("Allow")).perform(click());
        Thread.sleep(500); // Wait for the permission dialog to appear
        
        // Step 3: Click on the 'OK, I UNDERSTAND' button
        Espresso.onView(withId(R.id.id_understand)).perform(click());
        Thread.sleep(500); // Wait for the message to be displayed

        // Expected Result: The user is denied permission to use location services,
        // and the app displays a message indicating that location-based weather information cannot be provided.
        
        // Assert that the correct message is displayed
        Espresso.onView(ViewMatchers.withText("Location Services Denied"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}