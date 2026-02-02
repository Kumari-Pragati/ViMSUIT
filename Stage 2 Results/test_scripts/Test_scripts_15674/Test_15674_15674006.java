package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15674_15674006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testCheckProductDetails() throws InterruptedException {
        // Step 1: Open the shopping app (Assuming MainActivity is launched by default)
        
        // Step 2: Tap on the navigation menu icon in the header
        onView(withId(R.id.id_toolbar_logo)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Tap on a product category in the grid (Assuming there is a grid view with categories)
        // This step requires identifying the correct category and clicking it
        // For demonstration, let's assume the first category is selected
        onView(withId(R.id.category_grid)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Select a product and view its details (Assuming there is a list of products)
        // For demonstration, let's assume the first product in the list is selected
        onView(withId(R.id.product_list)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The product details page is displayed
        onView(withId(R.id.product_details_container)).check(matches(isDisplayed()));
    }
}