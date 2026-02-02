package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.FrameLayout;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_16112_16112003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Wait for the main activity to be fully loaded
        Espresso.onData(withText("HISTORY")).inAdapterView(FrameLayout.class).perform(click());
    }

    @Test
    public void testVerifyThatAHistoryEntryCanBeDeleted throws InterruptedException {
        // Step 1: Navigate to the HISTORY tab (assuming it's a tab layout)
        Thread.sleep(500);

        // Step 2: Locate the history entry for the word 'ROUSE'
        onView(withText("ROUSE")).inRoot(isDialog()).check(matches(ViewMatchers.isDisplayed()));

        // Step 3: Click on the trash icon next to the 'ROUSE' entry
        Thread.sleep(500);
        onView(withId(R.id.id_delete)).perform(click());

        // Expected result: The 'ROUSE' entry is removed from the HISTORY tab
        Thread.sleep(500);
        onView(withText("ROUSE")).inRoot(isDialog()).check(matches(not(ViewMatchers.isDisplayed())));
    }
}