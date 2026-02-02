package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ScrollView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_10544_10544003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForNewCarsNegativeFlowInvalidInput() throws InterruptedException {
        // Step 1: Open the CarWale app (Assuming MainActivity is launched by default)
        
        // Step 2: Tap on the 'New Car' tab
        onView(withId(R.id.id_scrollView)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Enter '1234567890' in the search input field
        onView(withId(R.id.id_searchInput)).perform(typeText("1234567890"));
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Tap on the 'FIND CAR' button
        onView(withId(R.id.id_findCarButton)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: An error message should be displayed indicating that the search term is invalid
        onView(ViewMatchers.withText("Invalid search term")).check(matches(isDisplayed()));
    }
}