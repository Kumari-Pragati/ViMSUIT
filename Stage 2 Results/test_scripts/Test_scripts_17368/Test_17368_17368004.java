package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Before;
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
public class Test_17368_17368004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    private TextView likeCountTextView;

    @Before
    public void setUp() {
        // Initialize the view for later use in assertions
        likeCountTextView = (TextView) activityTestRule.getActivity().findViewById(R.id.like_count);
    }

    @Test
    public void testLikeADessertRecipe throws InterruptedException {
        // Step 1: Open the mobile app - This is implicit when using ActivityTestRule

        // Step 2: Navigate to the Eggless Desserts screen
        onView(withText("Eggless Desserts")).perform(click());
        Thread.sleep(500); // Wait for UI to update after navigation

        // Step 3: Click on the heart icon next to a dessert recipe
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait for like count to update

        // Expected Result: The like count for the selected dessert recipe increases
        int initialLikeCount = Integer.parseInt(likeCountTextView.getText().toString());
        onView(withId(R.id.likeButton)).perform(click());
        Thread.sleep(500); // Wait for like count to update again

        int updatedLikeCount = Integer.parseInt(likeCountTextView.getText().toString());
        assert (updatedLikeCount == initialLikeCount + 1) : "Like count did not increase by 1";

        // Verify the like button text updates
        onView(withId(R.id.likeButton)).check(matches(withText(String.valueOf(updatedLikeCount))));
    }
}