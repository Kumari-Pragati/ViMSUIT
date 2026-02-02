package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_11235_1123501 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigatingToReviewsPage() throws InterruptedException {
        // Step 1: Open the Food Delivery App (Assuming it's already open)

        // Step 2: Navigate to the 'Biancorosso' restaurant page
        onView(withId(R.id.restaurant_name)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Click on the 'REVIEWS' tab
        onView(withId(R.id.id_tab_layout)).perform(click());
        Thread.sleep(500);

        // Expected Result: The 'REVIEWS' tab should be selected.
        // The content area should display the message 'No reviews' and 'There are no reviews found for this restaurant.'
        onView(withText("No reviews")).check(matches(ViewMatchers.isDisplayed()));
        onView(withText("There are no reviews found for this restaurant.")).check(matches(ViewMatchers.isDisplayed()));

        // Additional assertion to check if the Reviews tab is selected
        Espresso.onView(withId(R.id.id_tab_layout)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withContentDescription("Reviews")).inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.FrameLayout.class))).check(matches(ViewMatchers.isSelected()));
    }
}