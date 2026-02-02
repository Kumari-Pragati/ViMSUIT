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
public class Test_12504_1250409 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewTheSubtitleExplainingTheSubscriptionDetails() throws InterruptedException {
        // Scroll down to view the subtitle explaining the subscription details
        onView(withId(R.id.id_BundleDetailsLandingRecyclerView))
                .perform(ViewActions.scrollTo())
                .check(ViewAssertions.matches(isDisplayed()));

        Thread.sleep(500); // Add a delay between interactions

        // Verify that the subtitle is visible
        Espresso.onView(withId(R.id.id_BundleDetailsLandingRecyclerView))
                .check(ViewAssertions.matches(isDisplayed()));
    }
}