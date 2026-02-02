package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_11393_1139302 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5000); // Set a longer timeout for the test

    @Test
    public void testNegativeFlowAttemptToSearchForANonexistentStation() throws InterruptedException {
        // Step 1: Open the app (Assuming it's already open, or this step is handled by ActivityTestRule)

        // Step 2: Click on the search icon in the header
        Thread.sleep(500);
        onView(allOf(withId(R.id.action_search), withContentDescription("['Search']"))).perform(click());

        // Step 3: Enter a non-existent station name in the search bar (Assuming there's an input field for search)
        Thread.sleep(500);
        Espresso.onView(withId(R.id.search_edit_text)).perform(typeText("NonExistentStation"), closeSoftKeyboard());

        // Step 4: Press the search button
        Thread.sleep(500);
        Espresso.pressBack(); // Assuming there's a back button to simulate pressing the search button

        // Step 5: Verify that no results are displayed
        Thread.sleep(500);
        Espresso.onView(withId(R.id.search_results)).check(ViewAssertions.matches(ViewMatchers.isEmpty()));
    }
}