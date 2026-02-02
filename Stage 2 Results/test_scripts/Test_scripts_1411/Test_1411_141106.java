package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_1411_141106 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationEmptyGenreFilter() throws InterruptedException {
        // Navigate to the Browse page (assuming it's the initial screen)
        
        // Test each element
        for (int i = 0; i < 4; i++) {
            onView(withContentDescription("[None]"))
                .perform(click());
            Thread.sleep(500);
            
            // Clear the genre filter
            Espresso.onView(withContentDescription("[None]")).perform(ViewActions.clearText()).perform(ViewActions.closeSoftKeyboard());
            Thread.sleep(500);
            
            // Verify that the content list displays all TV shows
            Espresso.onView(isDisplayed()).check(matches(withContentDescription("[None]")));
        }
    }
}