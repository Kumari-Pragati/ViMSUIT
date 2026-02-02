package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_14946_14946009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnADressEngagementMetricToViewTheProductDetails() throws InterruptedException {
        // Step 1: Click on a dress engagement metric
        onView(allOf(withContentDescription("[None]"), isDisplayed())).perform(click());
        Thread.sleep(500); // Wait for the UI to update

        // Expected Result: The product details page for the selected dress is displayed
        onView(allOf(withId(R.id.productDetailsContainer), isDisplayed())).check(matches(isDisplayed()));
    }
}