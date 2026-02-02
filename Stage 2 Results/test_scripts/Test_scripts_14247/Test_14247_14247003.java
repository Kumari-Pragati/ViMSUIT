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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14247_14247003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheDeleteIconInTheHeader() throws InterruptedException {
        // Step 1: Open the app (Assuming it's already open, or you can add an intent to launch MainActivity)

        // Step 2: Click on the delete icon in the header
        Thread.sleep(500);
        onView(withId(R.id.id_action_clear)).perform(click());

        // Step 3: Verify the delete confirmation dialog is displayed
        Thread.sleep(500);
        onView(isDisplayed()).inRoot(org.robolectric.shadows.ShadowRoot.dialog()).check(matches(ViewMatchers.isDisplayed()));
    }
}