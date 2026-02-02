package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_17368_17368003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnADessertRecipe() throws InterruptedException {
        // Step 1: Open the mobile app (Assuming MainActivity is launched by default)
        
        // Step 2: Navigate to the Eggless Desserts screen
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait for navigation
        
        // Step 3: Click on one of the dessert recipes
        RecyclerView recyclerView = (RecyclerView) activityRule.getActivity().findViewById(R.id.recyclerView);
        if (recyclerView != null && recyclerView.getChildCount() > 0) {
            onView(withContentDescription("[None]")).perform(click());
            Thread.sleep(500); // Wait for recipe detail view to load
            
            // Expected Result: The detailed view of the selected dessert recipe is displayed
            onView(withId(R.id.recipeDetail)).check(matches(ViewMatchers.isDisplayed()));
        } else {
            fail("RecyclerView is empty or not found");
        }
    }
}