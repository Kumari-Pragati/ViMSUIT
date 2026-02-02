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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14946_14946008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnADressPriceToViewTheProductDetails() throws InterruptedException {
        // Step 1: Click on a dress price
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click());

        // Wait for the product details page to load
        Thread.sleep(500);

        // Step 2: Verify that the product details page is displayed
        Espresso.onView(withId(R.id.productDetailsContainer)).check(matches(ViewMatchers.isDisplayed()));
    }
}