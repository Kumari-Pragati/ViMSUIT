package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_11712_1171201 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndNavigateToTheFeaturedRecipePage() throws InterruptedException {
        // Open the cooking app (assumed to be done by the ActivityTestRule)
        
        // Navigate to the featured recipe page
        onView(withId(R.id.id_imgMainFeaturedRecipe)).perform(click());
        Thread.sleep(500); // Wait for 500ms to ensure the navigation is completed

        // Assert that the featured recipe page is displayed
        onView(withId(R.id.id_imgMainFeaturedRecipe)).check(matches(isDisplayed()));
    }
}