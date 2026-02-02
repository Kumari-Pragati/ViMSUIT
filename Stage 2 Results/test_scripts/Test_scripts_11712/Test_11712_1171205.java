package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11712_1171205 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheRecipeTitle() throws InterruptedException {
        // Step 1: Open the cooking app (Assuming MainActivity is launched by default)
        
        // Step 2: Navigate to the featured recipe page (This step might require additional UI interactions, which are not specified here. For now, we assume it's already on the correct screen.)
        
        // Step 3: Click on the recipe title
        Thread.sleep(500); // Wait for 500ms before interacting with the view
        
        onView(withId(R.id.id_imgMainFeaturedRecipe)).perform(click());
        
        // Step 4: Assert that the recipe details page is displayed
        Thread.sleep(500); // Wait for 500ms to ensure the transition is complete
        onView(withId(R.id.recipeDetailsContainer)).check(matches(isDisplayed()));
    }
}