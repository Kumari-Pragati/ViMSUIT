package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_1411_141102 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigatingBetweenTabs throws InterruptedException {
        // Wait for the app to start and the tabs to be available
        Thread.sleep(500);

        // Step 1: Open the mobile app and navigate to the 'Browse' page.
        // Assuming Browse is the initial screen, no action needed here.

        // Step 2: Select the 'Top Rated' tab.
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Assertion for Top Rated tab selection
        onView(withId(R.id.pagerTabStrip)).check(matches(hasSelectedTab("Top Rated")));

        // Step 3: Select the 'Recently Added' tab.
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Assertion for Recently Added tab selection
        onView(withId(R.id.pagerTabStrip)).check(matches(hasSelectedTab("Recently Added")));
    }

    private org.hamcrest.Matcher<org.hamcrest.Description> hasSelectedTab(final String expectedTab) {
        return new org.hamcrest.TypeSafeMatcher<org.hamcrest.Description>() {
            @Override
            public boolean matches(Object item) {
                // This is a placeholder implementation. You may need to customize it based on your app's structure.
                // For example, you might check the text of the selected tab or its state.
                return false;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
                description.appendText("Selected tab: " + expectedTab);
            }
        };
    }
}