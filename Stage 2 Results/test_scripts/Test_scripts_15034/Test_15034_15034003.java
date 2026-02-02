package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15034_15034003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheStatsOptionInTheHeader() throws InterruptedException {
        // Navigate to the promotional section (assuming it's the main screen)
        Thread.sleep(500); // Wait for 500ms

        // Click on the 'STATS' option in the header
        onView(withId(R.id.id_earthquake_alert_button)).perform(click());
        Thread.sleep(500); // Wait for 500ms

        // Assert that the app navigates to the 'STATS' section (this is a placeholder assertion)
        onView(withId(R.id.stats_section_id)).check(matches(isDisplayed()));
    }
}