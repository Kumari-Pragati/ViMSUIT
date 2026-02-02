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
public class Test_10128_10128002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForAnArticle() throws InterruptedException {
        // Open the Help section (assuming it's opened by default or through some other method)
        
        // Click on the search icon in the header
        onView(withId(R.id.id_uv_action_search)).perform(click());
        Thread.sleep(500);

        // Enter the search term 'locations' in the search bar
        onView(withText("Search")).inRoot(isDialog()).perform(ViewActions.typeText("locations"));
        Thread.sleep(500);

        // Press enter to perform the search
        Espresso.closeSoftKeyboard();
        onView(withText("Search")).inRoot(isDialog()).perform(ViewActions.pressImeAction(ViewMatchers.withId(android.R.id.search_src_text)));
        Thread.sleep(500);

        // Assert that search results for 'locations' are displayed (assuming a specific view or text is shown)
        onView(withText("locations")).check(matches(ViewMatchers.isDisplayed()));
    }
}