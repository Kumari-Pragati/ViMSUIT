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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15169_15169005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidYearSelection() throws InterruptedException {
        // Open the app and navigate to the 'New User' screen (Assuming this is done in setup)
        
        // Test each element
        for (int i = 0; i < 2; i++) {
            onView(withContentDescription("[None]")).perform(click());
            Thread.sleep(500);
            
            // Tap on the date picker dialog to select a birthday
            onView(withContentDescription("Month")).perform(ViewActions.click());
            Thread.sleep(500);
            
            // Select a month from the month selection field (Assuming this is done in setup)
            onView(withText("January")).perform(click());
            Thread.sleep(500);
            
            // Select a day from the day selection field (Assuming this is done in setup)
            onView(withContentDescription("Day")).perform(ViewActions.click());
            Thread.sleep(500);
            onView(withText("1")).perform(click());
            Thread.sleep(500);
            
            // Select an invalid year from the year selection field
            onView(withContentDescription("Year")).perform(ViewActions.click());
            Thread.sleep(500);
            Espresso.closeSoftKeyboard();
            onView(withText("-1")).perform(ViewActions.click());
            Thread.sleep(500);
            
            // Tap on the 'OK' button to confirm the birthday selection
            onView(withContentDescription("[None]")).perform(click());
            Thread.sleep(500);
            
            // Verify error message
            onView(withText("Invalid year selected. Please select a valid year."))
                    .inRoot(withDecorView(not(isRootView())))
                    .check(matches(isDisplayed()));
        }
    }
}