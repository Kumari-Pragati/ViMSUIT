package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_14946_14946001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testOpenTheAppAndNavigateToTheDressesProductListingPage() throws InterruptedException {
        // Step 1: Open the ShoppingApp (already done by ActivityTestRule)
        
        // Step 2: Navigate to the dresses product listing page
        Thread.sleep(500); // Wait for initial setup

        // Click on the "Dresses" category or similar navigation element
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Assert that the dresses product listing page is displayed
        onView(withId(R.id.listView)).check(matches(isDisplayed()));
    }
}