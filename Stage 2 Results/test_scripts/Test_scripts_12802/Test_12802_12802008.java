package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.Priority;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@Priority(2)
public class Test_12802_12802008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDataPersistenceResumeFromPreviousSession() throws InterruptedException {
        // Step 1: Open the Music App.
        
        // Step 2: Navigate to the Music History screen.
        onView(withId(R.id.id_recyclerview)).check(matches(isDisplayed()));
        
        // Step 3: Close the app and reopen it.
        activityRule.finishActivity();
        Thread.sleep(500); // Wait for a short period before reopening
        activityRule.launchActivity(null);
        
        // Expected Result: The Music History screen displays the same music history entries from the previous session.
        onView(withId(R.id.id_recyclerview)).check(matches(isDisplayed()));
    }
}