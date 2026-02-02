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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_15891_15891002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000);

    @Test
    public void testNegativeFlowEmptySearchBar() throws InterruptedException {
        // Step 1: Click on the search bar and leave it empty.
        onView(withId(R.id.search_bar)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click on the 'USE MY CURRENT LOCATION' button.
        onView(allOf(withContentDescription("['Outdated Version']"))).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should display an error message or prompt the user to enter an address.
        onView(withId(R.id.error_message)).check(matches(ViewMatchers.isDisplayed()));
    }
}