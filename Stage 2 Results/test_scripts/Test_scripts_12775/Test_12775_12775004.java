package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.view.ViewPager;
import org.junit.Rule;
import org.junit.Test;

public class Test_12775_12775004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForASpecificMod() throws InterruptedException {
        // Open the 'Falloutcrafter Mod' app and navigate to ALL MODS tab
        onView(withId(R.id.id_howto)).perform(click());
        Thread.sleep(500);
        
        // Tap on the search icon (magnifying glass) at the top of the screen
        Espresso.onView(ViewMatchers.withContentDescription("Search")).perform(ViewActions.click());
        Thread.sleep(500);

        // Enter the name of a specific mod, e.g., 'Nuke Addon'
        Espresso.onView(ViewMatchers.withText("Nuke Addon")).perform(ViewActions.typeText("Nuke Addon"), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Verify state for each element
        onView(withId(R.id.id_howto)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);
        
        onView(withId(R.id.id_sliding_tabs)).perform(click()).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withId(R.id.id_pager)).perform(ViewActions.click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withId(R.id.id_my_recycler_view)).perform(ViewActions.scrollToPosition(1));
        Thread.sleep(500);

        // Verify the search results display mods that match the entered name
        Espresso.onView(ViewMatchers.withText("Nuke Addon")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Loop through all 13 elements and perform test steps on each
        for (int i = 1; i <= 13; i++) {
            String elementId = "R.id.id_howto"; // Default to the first element if no specific id is provided
            switch (i) {
                case 2:
                    elementId = "R.id.id_sliding_tabs";
                    break;
                case 3:
                    elementId = "R.id.id_pager";
                    break;
                case 4:
                    elementId = "R.id.id_my_recycler_view";
                    break;
                default: // For elements with no specific id
                    elementId = "[None]";
            }
            
            if (!elementId.equals("[None]")) {
                Espresso.onView(ViewMatchers.withId(Integer.parseInt(elementId.replace("R.id.", "")))).perform(click()).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                Thread.sleep(500);
            } else {
                // Handle elements with no specific id
                Espresso.onView(ViewMatchers.withContentDescription("[None]")).perform(click()).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                Thread.sleep(500);
            }
        }

        // Additional assertions can be added here to verify the search results display mods that match the entered name
    }
}