package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_12921_1292105 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTurningOnFilters() throws InterruptedException {
        // Step 1: Click on the section prompting to turn on filters for better recommendations.
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI updates

        // Expected Result: The screen should display filter options to refine recommendations.
        onView(withContentDescription("Filter Options")).check(matches(isDisplayed()));
    }
}