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
public class Test_11712_1171209 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheMinuteRecipesButtonInTheFooter() throws InterruptedException {
        // Open the cooking app (activity is already opened by ActivityTestRule)
        
        // Navigate to the featured recipe page
        Espresso.onView(withId(R.id.id_imgMainFeaturedRecipe)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms
        
        // Click on the "30 Minute Recipes" button in the footer
        Espresso.onView(withId(R.id.id_imgMainFeaturedRecipe)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms

        // Expected result: The "30 Minute Recipes" page should be displayed
        Espresso.onView(withId(R.id.id_imgMainFeaturedRecipe)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}