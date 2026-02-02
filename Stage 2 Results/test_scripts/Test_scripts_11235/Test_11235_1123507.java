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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11235_1123507 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testRegressionTestNoReviews() throws InterruptedException {
        // Step 1: Open the Food Delivery App (Assuming MainActivity is launched by default)
        
        // Step 2: Navigate to the 'Biancorosso' restaurant page
        onView(withId(R.id.restaurant_list)).perform(click());
        Thread.sleep(500); // Wait for navigation
        
        // Step 3: Click on the 'REVIEWS' tab
        onView(withId(R.id.id_tab_layout)).perform(click());
        Thread.sleep(500); // Wait for tab change

        // Expected Result: The content area should display the message 'No reviews'
        onView(withText("No reviews")).check(matches(isDisplayed()));
        
        // Expected Result: There are no reviews found for this restaurant
        onView(withText("There are no reviews found for this restaurant.")).check(matches(isDisplayed()));
    }
}