package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

public class Test_15674_15674008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Initial setup if needed
    }

    @Test
    public void testCheckProductRatingsAndReviews() throws InterruptedException {
        // Step 1: Open the shopping app (Assuming it's already open)
        
        // Step 2: Tap on the navigation menu icon in the header
        onView(withId(R.id.id_drawer_layout)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Tap on a product category in the grid (Assuming first category is selected)
        RecyclerView recyclerView = activityRule.getActivity().findViewById(R.id.categories_recycler_view);
        View categoriesItem = recyclerView.getChildAt(0);
        if (categoriesItem != null) {
            categoriesItem.perform(ViewActions.click());
        }
        Thread.sleep(500); // Wait for UI to update

        // Step 4: Select a product and view its ratings and reviews
        RecyclerView productsRecyclerView = activityRule.getActivity().findViewById(R.id.products_recycler_view);
        View productItem = productsRecyclerView.getChildAt(0);
        if (productItem != null) {
            productItem.perform(ViewActions.click());
        }
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The product ratings and reviews are displayed
        onView(allOf(withId(R.id.product_ratings), isDisplayed())).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.product_reviews), isDisplayed())).check(matches(isDisplayed()));

        // Additional assertions can be added here if needed
    }
}