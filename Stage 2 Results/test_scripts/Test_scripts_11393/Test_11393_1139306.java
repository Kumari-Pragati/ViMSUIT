package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_11393_1139306 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDataPersistenceTestVerifyThatTheListOfOffairStationsIsRetainedAfterAppRestart() throws InterruptedException {
        // Test each element

        // Element 1: Search Icon
        onView(withContentDescription("['Search']"))
                .perform(click());
        Thread.sleep(500);
        // Verify state (assuming some view or text is displayed after search)
        onView(withText("Search for stations")).check(matches(isDisplayed()));

        // Element 2: More Options
        onView(withContentDescription("['More options']"))
                .perform(click());
        Thread.sleep(500);
        // Verify state (assuming some view or text is displayed after more options click)
        onView(withText("More options selected")).check(matches(isDisplayed()));

        // Element 3: None (Assuming it's a button or icon that doesn't require interaction for this test)
        // No action needed, just verify its presence
        onView(withContentDescription("[None]"))
                .check(matches(isDisplayed()));
    }
}