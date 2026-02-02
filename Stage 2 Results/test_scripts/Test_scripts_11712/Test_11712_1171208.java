package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11712_1171208 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnARecipeCardInTheListOfRecipes() throws InterruptedException {
        // Step 1: Open the cooking app (assumed to be done by ActivityTestRule)
        
        // Step 2: Navigate to the featured recipe page (assuming it's the main activity itself)
        
        // Step 3: Click on a recipe card in the list of recipes
        Thread.sleep(500); // Wait for UI to stabilize
        
        onView(withId(R.id.id_imgFeaturedRecipe1)).performClick();
        Thread.sleep(500); // Wait for the click action to complete and page to load

        // Expected Result: The selected recipe page should be displayed
        onView(withId(R.id.id_imgFeaturedRecipe1)).check(matches(isDisplayed()));
    }
}