package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;

import org.junit.Before;
import org.junit.Test;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_1332_133203 {

    private ActivityTestRule<MainActivity> activityTestRule;

    @Before
    public void setUp() {
        activityTestRule = new ActivityTestRule<>(MainActivity.class);
    }

    @Test
    public void testDeleteAnItemFromThePackingList() throws InterruptedException {
        // Step 1: Locate and click on the item 'Phone & charger'
        Espresso.onView(withId(R.id.phone_charger)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Locate and click on the delete icon next to 'Phone & charger'
        Espresso.onView(withContentDescription("Navigate up")).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The item 'Phone & charger' is removed from the packing list
        Espresso.onView(withId(R.id.phone_charger)).check(ViewAssertions.doesNotExist());
    }
}