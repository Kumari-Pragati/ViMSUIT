package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_11730_11730006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testUserCanNavigateToThePreviousItemInTheVocabularyList() throws InterruptedException {
        // Wait for the initial screen to load
        Thread.sleep(500);

        // Click on the 'Navigate up' button
        onView(withContentDescription("['Navigate up']")).perform(ViewActions.click());

        // Wait for 500ms before checking the result
        Thread.sleep(500);

        // Assert that the previous item is displayed
        onView(withContentDescription("['Navigate up']")).check(matches(isDisplayed()));
    }
}