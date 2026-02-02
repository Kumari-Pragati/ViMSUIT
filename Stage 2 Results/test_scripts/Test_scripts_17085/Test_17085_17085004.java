package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_17085_17085004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchFunctionalityWithMultipleWords() throws InterruptedException {
        // Element 1: Click on the search bar labeled 'Area or Zipcode'.
        onView(withId(R.id.id_search))
                .perform(click());
        Thread.sleep(500);
        
        // Type 'New York City' into the search bar.
        onView(withId(R.id.id_search))
                .perform(ViewActions.typeText("New York City"));
        Thread.sleep(500);

        // Press the enter key to perform the search.
        Espresso.pressBack();
        Thread.sleep(500);
        
        // Element 2: Verify that the scroll view is displayed
        onView(withId(R.id.id_scrollView1))
                .check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 3: Click on the search button.
        onView(withId(R.id.id_imgBtnSearch))
                .perform(click());
        Thread.sleep(500);
        
        // Element 4: Verify that the "More options" menu is displayed
        onView(withContentDescription("['More options']"))
                .check(matches(isDisplayed()));
    }
}