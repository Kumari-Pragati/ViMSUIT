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
public class Test_12504_1250404 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewTheMixAndMatchSection() throws InterruptedException {
        // Scroll down to view the 'MIX AND MATCH' section
        onView(withId(R.id.id_BundleDetailsLandingRecyclerView))
                .perform(ViewActions.scrollTo())
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Wait for 500ms before proceeding
        Thread.sleep(500);

        // Verify that the text 'MIX AND MATCH' is visible
        onView(withId(R.id.id_BundleDetailsLandingRecyclerView))
                .check(ViewAssertions.matches(ViewMatchers.withText("MIX AND MATCH")));
    }
}