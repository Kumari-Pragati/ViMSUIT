package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12504_1250410 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewTheMixAndMatchSection() throws InterruptedException {
        // Wait for the RecyclerView to be visible and scrollable
        Thread.sleep(500);
        
        // Find the RecyclerView with the specified ID
        onView(withId(R.id.id_BundleDetailsLandingRecyclerView))
                .check(ViewAssertions.matches(isDisplayed()));

        // Scroll down to view the 'MIX AND MATCH' section
        Espresso.onView(withId(R.id.id_BundleDetailsLandingRecyclerView))
                .perform(ViewActions.scrollTo())
                .perform(ViewActions.scrollBy(0, 100)); // Adjust scrollBy value as needed

        // Wait for a moment after scrolling
        Thread.sleep(500);

        // Assert that the 'MIX AND MATCH' section is visible
        Espresso.onView(withText("MIX AND MATCH"))
                .check(ViewAssertions.matches(isDisplayed()));
    }
}