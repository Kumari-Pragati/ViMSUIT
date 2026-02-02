package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Test_16664_16664003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Setup any necessary conditions before the test starts
    }

    @Test
    public void testClickOnACashbackOfferToViewDetails() throws InterruptedException {
        // Step 1: Select a cashback offer from the list.
        Thread.sleep(500);
        onView(withId(R.id.list)).perform(ViewActions.scrollToPosition(0));
        Thread.sleep(500);

        // Assuming the first item in the list is the cashback offer
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 2: Click on the selected cashback offer to view its details.
        // Wait for the navigation to complete and verify that we are on the correct screen

        // Assuming the expected result is a specific text or element in the new screen
        onView(withText("Cashback Offer Details")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}