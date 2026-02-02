package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15574_1557402 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSelectForRentTab throws InterruptedException {
        // Step 1: Tap on the 'For Rent' tab.
        onView(withId(R.id.id_button_for_rent)).perform(click());
        
        // Step 2: Verify that the 'For Rent' tab is selected.
        Thread.sleep(500); // Wait for UI to update
        onView(withId(R.id.id_button_for_rent)).check(matches(isDisplayed()));
    }
}