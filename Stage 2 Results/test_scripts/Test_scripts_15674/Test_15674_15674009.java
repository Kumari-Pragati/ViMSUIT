package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.RecyclerView;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_15674_15674009 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Wait for the app to be fully loaded before proceeding
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testVerifyProductPricing throws InterruptedException {
        // Step 1: Open the shopping app
        // Step 2: Tap on the navigation menu icon in the header
        onView(withId(R.id.id_toolbar_logo)).perform(click());
        
        // Step 3: Tap on a product category in the grid (assuming there's a RecyclerView for categories)
        onView(withId(R.id.categories_recycler_view)).check(matches(isDisplayed()));
        onView(withId(R.id.categories_recycler_view)).perform(ViewActions.scrollToPosition(0));
        onView(withId(R.id.categories_recycler_view)).perform(ViewActions.click());
        
        // Step 4: Select a product and verify its pricing
        Thread.sleep(500); // Wait for the product to load
        
        // Assuming there's a RecyclerView for products in the selected category
        onView(withId(R.id.products_recycler_view)).check(matches(isDisplayed()));
        onView(withId(R.id.products_recycler_view)).perform(ViewActions.scrollToPosition(0));
        
        // Click on the first product (assuming it has a pricing view)
        onView(withId(R.id.product_card_view)).perform(click());
        
        Thread.sleep(500); // Wait for the product details to load
        
        // Verify that the product pricing is displayed
        onView(withId(R.id.product_price_text_view)).check(matches(isDisplayed()));
    }
}