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
public class Test_11233_1123301 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyRestaurantInformationDisplay() throws InterruptedException {
        // Navigate to the 'Info' screen for 'La Carne Premium Meat'
        Espresso.onView(withId(R.id.id_back)).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify that the restaurant name 'La Carne Premium Meat' is displayed.
        Espresso.onView(withId(R.id.restaurant_name))
                .check(matches(withText("La Carne Premium Meat")));
        Thread.sleep(500);

        // Verify that the category 'Burgers, Grocery' is displayed.
        Espresso.onView(withId(R.id.category))
                .check(matches(withText("Burgers, Grocery")));
        Thread.sleep(500);

        // Verify that the rating '4 stars out of 5 based on 2 reviews' is displayed.
        Espresso.onView(withId(R.id.rating))
                .check(matches(withText("4 stars out of 5 based on 2 reviews")));
        Thread.sleep(500);

        // Verify that the minimum order 'AED 50.00' is displayed.
        Espresso.onView(withId(R.id.minimum_order))
                .check(matches(withText("AED 50.00")));
        Thread.sleep(500);

        // Verify that the payment methods 'Visa and Mastercard' are displayed.
        Espresso.onView(withId(R.id.payment_methods))
                .check(matches(withText("Visa and Mastercard")));
        Thread.sleep(500);

        // Verify that the city 'Abu Dhabi' is displayed.
        Espresso.onView(withId(R.id.city))
                .check(matches(withText("Abu Dhabi")));
        Thread.sleep(500);

        // Verify that the area 'Al Maqta' is displayed.
        Espresso.onView(withId(R.id.area))
                .check(matches(withText("Al Maqta")));
        Thread.sleep(500);

        // Verify that the status 'Open' is displayed.
        Espresso.onView(withId(R.id.status))
                .check(matches(withText("Open")));
        Thread.sleep(500);

        // Verify that the cuisines 'Burgers, Grocery' are displayed.
        Espresso.onView(withId(R.id.cuisines))
                .check(matches(withText("Burgers, Grocery")));
        Thread.sleep(500);

        // Verify that the opening hours '1:00PM - 6:00PM' are displayed.
        Espresso.onView(withId(R.id.opening_hours))
                .check(matches(withText("1:00PM - 6:00PM")));
    }
}