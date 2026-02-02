package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class Test_11475_1147506 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheMenuIconInTheHeader() throws InterruptedException {
        // Step 1: Open the Nail Art App (Assuming it's already open, or this step is handled by setup)

        // Step 2: Tap on the menu icon in the header
        Thread.sleep(500); // Wait for UI to stabilize

        onView(withContentDescription("More options")).perform(click());

        // Expected Result: The app should display the menu options
        Thread.sleep(500); // Wait for the menu to appear
        onView(isRoot()).check(matches(isDisplayed()));
    }
}