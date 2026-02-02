package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class Test_17368_17368002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheFifthDessertRecipe() throws InterruptedException {
        // Step 1: Open the mobile app (Assuming MainActivity is launched by default)
        
        // Step 2: Navigate to the Eggless Desserts screen
        Espresso.onView(ViewMatchers.withText("Eggless Desserts")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Scroll down to view the fifth dessert recipe
        RecyclerView recyclerView = activityRule.getActivity().findViewById(R.id.recyclerView);
        int itemPosition = 4; // Index starts from 0, so position 5 is index 4
        Espresso.onView(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE))
                .atPosition(itemPosition)
                .perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The fifth dessert recipe is partially visible at the bottom of the screen
        Espresso.onView(ViewMatchers.withContentDescription("[None]"))
                .check(matches(isDisplayed()));
    }
}