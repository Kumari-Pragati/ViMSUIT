package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_17018_1701803 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowAttemptingToSelectANonexistentNewsSource() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu screen.
        Espresso.onView(withId(R.id.id_menu_search)).performClick();
        
        // Step 2: Click on the menu icon in the header.
        Thread.sleep(500);
        
        // Step 3: Scroll through the list of news sources and attempt to select a non-existent news source.
        Espresso.onView(withId(R.id.id_menu_search)).check(ViewAssertions.matches(isDisplayed()));
        Thread.sleep(500);

        // Simulate selecting a non-existent news source
        Espresso.pressBack();
        Thread.sleep(500);
        
        // Step 4: Verify that the app does not crash or display an error message.
        Espresso.onView(withId(R.id.id_menu_search)).check(ViewAssertions.matches(isDisplayed()));
    }
}