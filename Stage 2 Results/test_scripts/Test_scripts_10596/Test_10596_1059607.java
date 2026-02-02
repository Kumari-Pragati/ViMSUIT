package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.MediumTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@MediumTest
public class Test_10596_1059607 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testVerifyTheUsabilityOfTheScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the Help screen.
        Espresso.onView(ViewMatchers.withText("Help")).performClick();
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Verify that the screen is easy to navigate and understand.
        Espresso.onView(ViewMatchers.isRoot()).check(matches(isDisplayed()));
        
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Check if the search functionality works as expected.
        onView(withId(R.id.id_hs__search)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        Espresso.onView(ViewMatchers.withText("Search")).check(matches(isClickable()));
    }
}