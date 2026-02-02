package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_10693_10693002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidNavigation() throws InterruptedException {
        // Open the app and navigate to the 'MASCOTS' section.
        onView(withId(R.id.id_tab_view)).perform(ViewActions.click());
        Thread.sleep(500);
        onView(withId(R.id.id_viewpager)).perform(ViewActions.click());
        Thread.sleep(500);

        // Navigate to the 'TEAMS' section.
        for (int i = 1; i <= 4; i++) {
            onView(withId(R.id.id_emoji_image)).perform(ViewActions.click());
            Thread.sleep(500);
        }

        // Navigate to the 'ALL-STAR' section.
        onView(withContentDescription("['More options']")).perform(ViewActions.click());
        Thread.sleep(500);

        for (int i = 1; i <= 16; i++) {
            onView(withId(R.id.id_emoji_image)).perform(ViewActions.click());
            Thread.sleep(500);
        }

        // Attempt to navigate back to the 'MASCOTS' section from the 'ALL-STAR' section.
        for (int i = 1; i <= 8; i++) {
            onView(withId(R.id.id_emoji_image)).perform(ViewActions.click());
            Thread.sleep(500);
        }

        // Verify that navigation back to 'MASCOTS' is not possible
        onView(withId(R.id.id_tab_view)).check(matches(isDisplayed()));
    }
}