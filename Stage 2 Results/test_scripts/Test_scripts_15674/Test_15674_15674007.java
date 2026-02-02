package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_15674_15674007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Wait for the app to be fully loaded before starting tests
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testVerifyProductAvailability() throws InterruptedException {
        // Step 1: Open the shopping app
        // Step 2: Tap on the navigation menu icon in the header
        onView(withId(R.id.id_toolbar_logo)).perform(click());
        
        // Step 3: Tap on a product category in the grid (assuming there's a grid view with categories)
        // For demonstration, let's assume the first category is selected
        Thread.sleep(500);
        onView(withId(R.id.category_grid_view)).perform(ViewActions.scrollToPosition(0));
        Thread.sleep(500);
        onView(withId(R.id.category_grid_view)).perform(ViewActions.click());
        
        // Step 4: Select a product and verify its availability
        // For demonstration, let's assume the first product in the list is selected
        Thread.sleep(500);
        onView(withId(R.id.product_list_view)).perform(ViewActions.scrollToPosition(0));
        Thread.sleep(500);
        onView(withId(R.id.product_list_view)).perform(ViewActions.click());
        
        // Verify that the product availability status is displayed
        Thread.sleep(500);
        onView(withText("Available")).check(matches(isDisplayed()));
    }
}