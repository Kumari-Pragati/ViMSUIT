package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1411_141105 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testNegativeFlowInvalidGenreSelection() throws InterruptedException {
        // Step 1: Open the mobile app and navigate to the 'Browse' page.
        Thread.sleep(500);

        // Step 2: Click on the 'Romance' genre filter button.
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Step 3: Enter an invalid genre name (e.g., 'Fantasy123').
        onView(withText("Romance")).perform(ViewActions.typeText("Fantasy123"), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Step 4: Verify that the genre filter is not applied.
        onView(withContentDescription("[None]")).check(matches(withText("Romance")));
    }
}