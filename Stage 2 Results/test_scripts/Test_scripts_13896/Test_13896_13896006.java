package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(JUnit4.class)
public class Test_13896_13896006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInputTextInTheSearchBar() throws InterruptedException {
        // Step 1: Locate and click on the search bar at the top of the screen.
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Enter text in the search bar.
        Espresso.onView(ViewMatchers.withId(R.id.search_edit_text)).perform(ViewActions.typeText("test input"));
        
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The search bar should accept text input.
        Espresso.onView(ViewMatchers.withId(R.id.search_edit_text)).check(matches(isDisplayed()));
    }
}