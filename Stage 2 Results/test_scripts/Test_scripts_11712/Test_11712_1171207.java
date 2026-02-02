package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_11712_1171207 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheRecipeDescription() throws InterruptedException {
        // Step 1: Open the cooking app (assumed to be done by the rule)
        
        // Step 2: Navigate to the featured recipe page (assuming it's already on this screen for simplicity)

        // Step 3: Click on the recipe description
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.id_imgMainFeaturedRecipe)).perform(click());

        // Expected Result: The app should open successfully. | The recipe details page should be displayed.
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.recipeDetailsView)).check(matches(isDisplayed()));
    }
}