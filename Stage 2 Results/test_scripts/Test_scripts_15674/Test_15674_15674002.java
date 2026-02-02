package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_15674_15674002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateThroughTheNavigationMenu() throws InterruptedException {
        // Open the shopping app

        // Tap on the navigation menu icon in the header
        onView(withId(R.id.id_drawer_layout))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withContentDescription("Navigate up")).check(matches(isDisplayed()));

        // Tap on each category in the navigation menu: & BEAUTY, CHILDREN, HOMWARE, and UPCOMING SALES
        for (String category : new String[]{"& BEAUTY", "CHILDREN", "HOMWARE", "UPCOMING SALES"}) {
            Espresso.onView(withContentDescription(category)).perform(ViewActions.click());
            Thread.sleep(500);
            Espresso.onView(withId(R.id.id_fragment_sales_recycler_view)).check(matches(isDisplayed()));
        }

        // Verify state
    }
}