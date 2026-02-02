package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_10594_1059401 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTheSyncmeLogoAtTheTopOfTheScreen() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before proceeding
        Thread.sleep(500);

        // Verify that the SyncMe logo is present at the top of the screen
        onView(withId(R.id.id_viewSwitcher)).check(matches(isDisplayed()));

        // Additional sleep for stability
        Thread.sleep(500);
    }
}