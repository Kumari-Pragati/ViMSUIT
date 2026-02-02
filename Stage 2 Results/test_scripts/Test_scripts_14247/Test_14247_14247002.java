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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14247_14247002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testClickOnTheShareIconInTheHeader() throws InterruptedException {
        // Step 1: Open the app (Assuming it's already open as part of the setup)

        // Step 2: Click on the share icon in the header
        Thread.sleep(500);
        onView(withId(R.id.id_action_share)).perform(click());

        // Step 3: Verify the share options are displayed
        Thread.sleep(500);
        onView(isDisplayed()).inRoot(org.robolectric.shadows.ShadowRoot.dialog()).check(matches(ViewMatchers.isAssignableFrom(android.widget.ListView.class)));
    }
}