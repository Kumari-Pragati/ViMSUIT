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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_1184_1184001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testOpenTheAppAndNavigateToThePregnancyCalendarView() throws InterruptedException {
        // Open the app (already done by ActivityTestRule)

        // Step 1: Navigate to the pregnancy calendar view
        onView(allOf(withId(R.id.open_navigation_drawer), withContentDescription("['Open navigation drawer']"))).perform(click());
        Thread.sleep(500); // Wait for the navigation drawer to open

        // Step 2: Verify that the pregnancy calendar view is displayed
        onView(withId(R.id.pregnancy_calendar_view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}