package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17587_17587002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateThroughTheTabsInTheNavigationBar() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_o3))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withId(R.id.id_o4))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withId(R.id.id_hs))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withId(R.id.id_j5))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withId(R.id.id_m1))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withId(R.id.id_j5))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withId(R.id.id_a3))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withId(R.id.id_j5))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withId(R.id.id_hg))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        // Verify state
    }
}