package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withResourceName;

@RunWith(JUnit4.class)
public class Test_15095_15095003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheScreenDisplaysTheCorrectIconsInTheHeader() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Watchlist' page.
        // Assuming there is a navigation action to go to Watchlist from MainActivity
        onView(withId(R.id.nav_watchlist)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Verify that the header displays the correct icons:
        // a profile icon, an information icon, and a search icon.

        // Profile Icon
        onView(withResourceName("id_header_profile_btn")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Information Icon
        onView(withResourceName("id_header_info_btn")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Search Icon
        onView(withId(R.id.id_header_search_btn)).check(matches(isDisplayed()));

        // Additional check for the search icon to ensure it's an ImageView
        ImageView searchIcon = (ImageView) Espresso.onData(withResourceName("id_header_search_btn")).inAdapterView().onChildView(withId(android.R.id.icon)).get(0);
        assertNotNull(searchIcon);
    }
}