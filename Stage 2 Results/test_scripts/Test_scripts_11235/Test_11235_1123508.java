package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_11235_1123508 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5000); // Set a longer timeout for the test

    @Test
    public void testDataPersistenceTestMinimumOrderAmount() throws InterruptedException {
        // Step 1: Open the Food Delivery App (Assuming MainActivity is launched by default)
        
        // Step 2: Navigate to the 'Biancorosso' restaurant page
        onView(withId(R.id.id_tab_layout)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Verify the minimum order amount displayed is AED 49.00
        TextView minOrderAmountTextView = (TextView) Espresso.onView(withText("Biancorosso"))
                .inRoot(org.hamcrest.core.Is.is(org.espresso.contrib.RootMatchers.withDecorView(not(activityRule.getActivity().getWindow().getDecorView()))))
                .perform(ViewActions.click())
                .check(matches(isDisplayed()))
                .onChildView(withId(R.id.minimum_order_amount_text_view));
        
        onView(withText("AED 49.00")).inRoot(org.espresso.contrib.RootMatchers.withDecorView(not(activityRule.getActivity().getWindow().getDecorView()))).check(matches(withText("AED 49.00")));
    }
}