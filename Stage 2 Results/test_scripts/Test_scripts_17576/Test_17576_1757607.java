package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class Test_17576_1757607 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForDataPersistence() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Help/Info' page.
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Verify that the Help/Info page is displayed
        assertTrue("Help/Info page should be displayed", onView(withId(R.id.help_info_page)).check(matches(isDisplayed())).isDisplayed());

        // Step 2: Close the app and reopen it to verify that the 'Help/Info' page remains accessible.
        activityTestRule.finishActivity();
        Thread.sleep(500); // Wait for UI to update
        activityTestRule.launchActivity(null);

        // Verify that the Help/Info page is still displayed after reopening the app
        assertTrue("Help/Info page should remain accessible", onView(withId(R.id.help_info_page)).check(matches(isDisplayed())).isDisplayed());
    }
}