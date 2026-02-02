package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_1411_141101 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBrowsePageLoadsWithRomanceGenreFilter throws InterruptedException {
        // Step 1: Open the mobile app and navigate to the 'Browse' page.
        onView(withId(R.id.browse_button)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Verify that the 'Romance' genre filter is applied.
        onView(withContentDescription("[None]")).check(matches(ViewMatchers.withText("Romance")));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Check that the content list displays TV shows filtered by the 'Romance' genre.
        onView(withId(R.id.genre_filter_button)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Assuming there is a TextView or other view displaying the filtered content
        onView(withId(R.id.filtered_content_view)).check(matches(ViewMatchers.withText("Filtered by Romance")));
    }
}