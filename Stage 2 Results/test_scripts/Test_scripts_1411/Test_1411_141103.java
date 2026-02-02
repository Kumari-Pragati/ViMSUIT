package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Before;
import org.junit.Test;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_1411_141103 {

    private ActivityTestRule<MainActivity> activityTestRule;

    @Before
    public void setUp() {
        activityTestRule = new ActivityTestRule<>(MainActivity.class);
    }

    @Test
    public void testClearingTheGenreFilter() throws InterruptedException {
        // Open the mobile app and navigate to the 'Browse' page.
        Espresso.onView(withId(R.id.browse_page)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for 500ms

        // Click on the 'Romance' genre filter button.
        onView(withContentDescription("[None]")).perform(ViewActions.click());

        Thread.sleep(500); // Wait for 500ms

        // Verify that the genre filter is cleared.
        Espresso.onView(withId(R.id.genre_filter)).check(ViewAssertions.matches(ViewMatchers.withText("")));
    }
}