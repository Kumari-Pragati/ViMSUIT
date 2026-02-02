package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_13189_13189002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheLiveButton() throws InterruptedException {
        // Step 1: Open the news application (Assuming it's already open, or launch from rule)
        
        // Step 2: Navigate to the news feed section
        Espresso.onView(ViewMatchers.withId(R.id.news_feed_container)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 3: Click on the 'LIVE' button
        Thread.sleep(500);
        Espresso.onView(ViewMatchers(withId(R.id.id_action_live_stream))).perform(ViewActions.click());

        // Step 4: Verify that the 'LIVE' button toggles the news feed to a live stream if available
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Live")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}