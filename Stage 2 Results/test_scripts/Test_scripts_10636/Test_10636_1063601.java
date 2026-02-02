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

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_10636_1063601 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheFeaturedSectionOfChampionsLeagueCoverage() throws InterruptedException {
        // Step 1: Open the Eurosport app (Assuming MainActivity is launched by default)
        
        // Step 2: Tap on the 'Featured' tab in the navigation bar
        Thread.sleep(500); // Wait for UI to load and stabilize
        onView(withId(R.id.id_tablayout)).perform(click());
        Thread.sleep(500); // Additional wait time

        // Expected Result: The 'Featured' section of the Champions League coverage is displayed
        Espresso.onView(isDisplayed()).inRoot(isDialog()).check(ViewAssertions.matches(isDisplayed()));
    }
}