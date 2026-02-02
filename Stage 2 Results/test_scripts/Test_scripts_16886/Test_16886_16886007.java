package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_16886_16886007 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistenceWhenNavigatingAwayFromTheScreen throws InterruptedException {
        // Step 1: Open the app and navigate to the property listing screen.
        onView(withContentDescription("Open Property Listing")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Navigate away from the screen (e.g., to the home screen).
        onView(withContentDescription("Home")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Navigate back to the property listing screen.
        onView(withContentDescription("Open Property Listing")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Verify the property details are still displayed correctly.
        RecyclerView recyclerView = (RecyclerView) activityTestRule.getActivity().findViewById(R.id.listingProfileFragment);
        onView(recyclerView).check(matches(isDisplayed()));
    }
}