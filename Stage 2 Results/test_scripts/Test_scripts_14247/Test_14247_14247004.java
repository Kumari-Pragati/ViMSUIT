package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.widget.ActionMenuPresenter$OverflowMenuButton;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_14247_14247004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheMoreOptionsIconInTheHeader() throws InterruptedException {
        // Step 1: Open the app (Assuming it's already opened by ActivityTestRule)

        // Step 2: Click on the more options icon in the header
        Thread.sleep(500);
        onView(withContentDescription("['More options']")).perform(click());

        // Step 3: Verify the more options menu is displayed
        Thread.sleep(500);
        onView(withContentDescription("['More options']")).check(matches(isDisplayed()));
    }
}