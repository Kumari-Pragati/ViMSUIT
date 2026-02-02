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

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15674_15674005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Initial setup if needed
    }

    @Test
    public void testAddAProductToTheShoppingBag() throws InterruptedException {
        // Step 1: Open the shopping app (initial screen is already open due to ActivityTestRule)

        // Step 2: Tap on the navigation menu icon in the header
        onView(withId(R.id.id_toolbar_logo)).perform(click());
        Thread.sleep(500);

        // Step 3: Tap on a product category in the grid
        onView(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(RecyclerView.class))).check(matches(isDisplayed()));
        onView(withId(R.id.product_category_grid)).perform(click());
        Thread.sleep(500);

        // Step 4: Select a product and add it to the shopping bag
        onView(withId(R.id.product_item)).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.add_to_bag_button)).perform(click());
        Thread.sleep(500);

        // Expected Result: The product is added to the shopping bag
        onView(withId(R.id.shopping_bag_icon)).check(matches(isDisplayed()));
    }
}