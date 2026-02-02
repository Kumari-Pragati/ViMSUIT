package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_17346_1734611 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanAccessTheSearchBar() throws InterruptedException {
        // Click on the search bar (represented by the station logo)
        Thread.sleep(500);
        onView(allOf(withId(R.id.id_station_logo), isClickable())).perform(ViewActions.click());

        // Wait for 500ms to ensure the UI has time to respond
        Thread.sleep(500);

        // Assert that the search bar is active and ready for input
        Espresso.onView(withId(R.id.search_bar)).check(matches(isClickable()));
    }
}