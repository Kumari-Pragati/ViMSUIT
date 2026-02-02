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

public class Test_11712_1171206 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheRecipeImage() throws InterruptedException {
        // Open the cooking app (assumed to be done by the rule)
        
        // Navigate to the featured recipe page
        Thread.sleep(500); // Wait for the app to load and navigate

        // Click on the recipe image
        onView(withId(R.id.id_imgMainFeaturedRecipe)).perform(click());
        Thread.sleep(500); // Wait before checking the result
        
        // Assert that the recipe details page is displayed
        onView(withId(R.id.recipeDetailsContainer)).check(matches(isDisplayed()));
    }
}