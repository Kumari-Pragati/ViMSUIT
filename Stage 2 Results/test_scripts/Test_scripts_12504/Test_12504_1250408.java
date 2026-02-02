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
public class Test_12504_1250408 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewTheTextEssentialsBundle() throws InterruptedException {
        // Wait for the RecyclerView to be visible and scrollable
        Thread.sleep(500);
        
        // Find the RecyclerView with the specified ID
        onView(withId(R.id.id_BundleDetailsLandingRecyclerView))
                .check(ViewAssertions.matches(isDisplayed()));

        // Scroll down to view the text 'Essentials Bundle'
        Espresso.onView(withId(R.id.id_BundleDetailsLandingRecyclerView))
                .perform(ViewActions.scrollTo())
                .perform(ViewActions.scrollToEnd(true));

        // Wait for 500ms before checking if the text is visible
        Thread.sleep(500);

        // Check if the text 'Essentials Bundle' is displayed
        Espresso.onView(withText("Essentials Bundle"))
                .check(ViewAssertions.matches(isDisplayed()));
    }
}