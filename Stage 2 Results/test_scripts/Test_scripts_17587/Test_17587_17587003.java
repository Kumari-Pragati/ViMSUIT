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

@RunWith(AndroidJUnit4.class)
public class Test_17587_17587003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnAnArticleInTheForYouSection() throws InterruptedException {
        // Step 1: Open the news app (Assuming MainActivity is the entry point)
        
        // Step 2: Tap on the 'For You' tab in the navigation bar
        Espresso.onView(ViewMatchers.withId(R.id.nav_for_you)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Tap on an article in the list of articles
        Espresso.onView(withId(R.id.id_j5)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for navigation

        // Expected Result: The app should navigate to the article details page
        Espresso.onView(withId(R.id.article_details_container)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}