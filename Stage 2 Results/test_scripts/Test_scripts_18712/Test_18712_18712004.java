package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
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
public class Test_18712_18712004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserClicksOnTheOkIUnderstandButtonMultipleTimes throws InterruptedException {
        // Step 1: Open the Weather Live app (Assuming it's already open and on the permission request page)
        
        // Step 2: Navigate to the permission request page (Assuming this step is handled by the app itself)

        // Step 3: Click on the 'OK, I UNDERSTAND' button multiple times
        onView(withId(R.id.id_understand)).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_understand)).perform(click());
        Thread.sleep(500);
        
        // Expected Result Assertions
        // Assuming that clicking the 'OK, I UNDERSTAND' button multiple times should eventually grant permission and proceed to the main screen with location-based weather information.
        // Here we are checking if the main screen is displayed after a few clicks.

        onView(withId(R.id.main_screen)).check(matches(isDisplayed()));
    }
}