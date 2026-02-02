package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_16112_16112001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheHistoryTabIsDisplayedCorrectly() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Click on the HISTORY tab
        onView(withId(R.id.id_sliding_tabs)).perform(click());
        Thread.sleep(500);

        // Verify that the HISTORY tab is displayed
        onView(ViewMatchers.withText("HISTORY")).check(matches(isDisplayed()));

        // Additional assertions can be added here to verify the list of previously searched terms and their Hindi translations
    }
}