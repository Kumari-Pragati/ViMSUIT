package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11235_1123503 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryvalidationMinimumOrderAmount() throws InterruptedException {
        // Step 1: Open the Food Delivery App (Assuming app is already open and MainActivity is launched)
        
        // Step 2: Navigate to the 'Biancorosso' restaurant page
        Espresso.onView(withId(R.id.id_tab_layout)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Verify the minimum order amount displayed is AED 49.00
        Espresso.onView(withText("Biancorosso")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        Espresso.onView(withId(R.id.minimum_order_amount)).check(matches(withText("AED 49.00")));
    }
}