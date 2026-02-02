package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_11499_11499004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTogglesStateSortingOptions() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Gallery' screen.
        Espresso.onView(withId(R.id.gallery_screen)).perform(ViewActions.click());

        // Step 2: Tap on the 'Relevance' tab to view the apartment listings.
        Thread.sleep(500);
        onView(withId(R.id.id_relevanceId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.listing_container)).check(ViewAssertions.matches(isDisplayed()));

        // Step 3: Tap on the 'Price' tab to view the apartment listings.
        Thread.sleep(500);
        onView(withId(R.id.id_priceId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.listing_container)).check(ViewAssertions.matches(isDisplayed()));

        // Step 4: Tap on the 'Size' tab to view the apartment listings.
        Thread.sleep(500);
        onView(withId(R.id.id_sizeId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.listing_container)).check(ViewAssertions.matches(isDisplayed()));

        // Step 5: Tap on the 'Updated' tab to view the apartment listings.
        Thread.sleep(500);
        onView(withId(R.id.id_updatedId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.listing_container)).check(ViewAssertions.matches(isDisplayed()));
    }
}