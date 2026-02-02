package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11712_1171203 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnARecipeCardInTheListOfRecipes() throws InterruptedException {
        // Open the cooking app (assumed to be done by the ActivityTestRule)
        
        // Navigate to the featured recipe page
        Thread.sleep(500); // Wait for the UI to load

        // Click on a recipe card in the list of recipes
        onView(withId(R.id.id_imgFeaturedRecipe1)).perform(click());
        Thread.sleep(500); // Wait for the click action to complete
        
        // Expected result: The selected recipe page should be displayed
        onView(withId(R.id.recipeDetailsContainer)).check(matches(isDisplayed()));
    }
}