package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.SearchView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class Test_15950_1595001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchFunctionalityPositiveFlow() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Teams' screen.
        // Assuming Teams screen is the default or can be navigated directly from MainActivity
        Thread.sleep(500); // Wait for initial screen load

        // Step 2: Click on the search bar.
        onView(withId(R.id.id_search_query_section)).perform(click());
        Thread.sleep(500);

        // Step 3: Type 'Barcelona' into the search bar.
        SearchView searchView = (SearchView) Espresso.onView(ViewMatchers.withId(R.id.id_search_query_section)).inRoot(isDialog()).check(matches(isDisplayed())).perform(ViewActions.typeText("Barcelona")).onView(ViewMatchers.isAssignableFrom(SearchView.class)).perform(ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Step 4: Press the 'Enter' key to perform the search.
        Espresso.pressBack();
        Thread.sleep(500);

        // Expected Result: The search results should display 'Barcelona' and other related teams.
        onView(ViewMatchers.withText("Barcelona")).check(matches(isDisplayed()));
        assertTrue(true); // Placeholder for more specific assertions
    }
}