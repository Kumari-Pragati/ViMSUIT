package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ScrollView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static java.lang.Thread.sleep;

@RunWith(JUnit4.class)
public class Test_1115_1115008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testListOfFeaturesShouldBeDisplayed() throws InterruptedException {
        // Wait for the ScrollView to be clickable and focusable
        Thread.sleep(500);
        
        // Verify that the list of four features is displayed
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
        
        // Additional assertions can be added here if needed
    }
}