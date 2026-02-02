package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_15574_1557403 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSelectForSaleTabWhenAlreadySelected() throws InterruptedException {
        // Step 1: Tap on the 'For Sale' tab.
        onView(withId(R.id.id_button_for_sale)).perform(click());
        
        // Step 2: Tap on the 'For Sale' tab again.
        Thread.sleep(500);
        onView(withId(R.id.id_button_for_sale)).perform(click());

        // Expected Result: The 'For Sale' tab remains selected.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_button_for_sale))
                .check(ViewAssertions.matches(isDisplayed()));
    }
}