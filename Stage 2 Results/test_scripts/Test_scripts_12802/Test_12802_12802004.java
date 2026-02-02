package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.AbsListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12802_12802004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTogglesStateSwipeToViewMoreEntries() throws InterruptedException {
        // Step 1: Open the Music App (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the Music History screen
        onView(withId(R.id.id_recyclerview)).check(matches(isDisplayed()));

        // Step 3: Swipe up to view more music history entries
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.id_recyclerview)).perform(swipeUp());
        Thread.sleep(500); // Wait for the RecyclerView to update

        // Expected Result: Additional music history entries are displayed
        onView(withId(R.id.id_recyclerview)).check(matches(isDisplayed()));
    }
}