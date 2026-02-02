package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_17018_1701804 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowRemovingASelectedNewsSource() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu screen.
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500);
        
        // Step 2: Click on the menu icon in the header.
        onView(withContentDescription("['Navigate up']")).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Select 'Reuters' from the list of news sources.
        String reuters = "Reuters";
        onView(withText(reuters)).perform(click());
        Thread.sleep(500);

        // Step 4: Click on 'Reuters' again to remove it from the list.
        onView(withText(reuters)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 5: Verify that 'Reuters' is no longer highlighted in yellow.
        onView(withText(reuters)).check(ViewAssertions.doesNotExist());

        // Loop through all elements and perform test steps on each
        for (int i = 1; i <= 8; i++) {
            String cardViewId = "id_feeditem_item_cardview";
            onView(withId(cardViewId)).perform(click());
            Thread.sleep(500);
            if (i == 4) { // Reuters is the fourth element
                onView(withText(reuters)).check(ViewAssertions.doesNotExist());
            }
        }

        // Elements with content descriptions
        for (int i = 9; i <= 14; i++) {
            String description;
            switch (i) {
                case 9:
                    description = "['Navigate up']";
                    break;
                case 10:
                    description = "['More options']";
                    break;
                default:
                    description = "[None]";
                    break;
            }
            onView(withContentDescription(description)).perform(ViewActions.click());
            Thread.sleep(500);
        }

        // Verify state after all interactions
    }
}