package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.AbsListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(JUnit4.class)
public class Test_13189_13189001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheDisplayOfTheNewsFeed() throws InterruptedException {
        // Step 1: Open the news application (already done by ActivityTestRule)
        
        // Step 2: Navigate to the news feed section
        onView(ViewMatchers.withText("News Feed")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Verify that the news feed displays recent articles with headlines and publication dates
        // Check if recyclerView is displayed
        onView(withId(R.id.id_recyclerView)).check(matches(isDisplayed()));
        
        // Scroll down to check at least two articles are visible
        Espresso.onView(allOf(withId(R.id.id_recyclerView), isDisplayed()))
                .perform(ViewActions.scrollToPosition(1));
        
        Thread.sleep(500); // Wait for UI to update after scrolling
        
        // Verify that the first article has a headline and publication date
        onView(allOf(withId(android.R.id.text1), isDisplayed())).check(matches(isDisplayed()));
        onView(allOf(withId(android.R.id.text2), isDisplayed())).check(matches(isDisplayed()));
        
        // Verify that the second article has a headline and publication date
        Espresso.onView(allOf(withId(android.R.id.text1), isDisplayed()))
                .inRoot(AbsListView.withId(R.id.id_recyclerView))
                .perform(ViewActions.scrollToPosition(2));
        
        Thread.sleep(500); // Wait for UI to update after scrolling
        
        onView(allOf(withId(android.R.id.text1), isDisplayed())).check(matches(isDisplayed()));
        onView(allOf(withId(android.R.id.text2), isDisplayed())).check(matches(isDisplayed()));
    }
}