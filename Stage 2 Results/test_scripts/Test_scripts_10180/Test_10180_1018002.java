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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_10180_1018002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForASpecificMovie() throws InterruptedException {
        // Step 1: Click on the search icon in the header
        onView(withId(R.id.id_menu_search)).perform(click());
        Thread.sleep(500);

        // Step 2: Enter 'Christmas on the Bayou' in the search bar
        onView(withText("Search")).inRoot(isDialog()).perform(ViewActions.typeText("Christmas on the Bayou"));
        Thread.sleep(500);

        // Step 3: Press enter to perform the search
        Espresso.closeSoftKeyboard();
        Thread.sleep(500);

        // Expected Result: The search results should display 'Christmas on the Bayou'
        onView(withText("Christmas on the Bayou")).check(matches(isDisplayed()));
    }
}