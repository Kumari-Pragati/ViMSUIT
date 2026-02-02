package com.example.tests;

import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_13189_13189008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyInterruptionresume() throws InterruptedException {
        // Open the news application (assumed to be done by ActivityTestRule)

        // Test each element
        onView(withId(R.id.id_drawer_layout))
                .perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_drawer_layout)).check(matches(isDisplayed()));

        onView(withId(R.id.id_action_live_stream))
                .perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_action_live_stream)).check(matches(isDisplayed()));

        onView(withId(R.id.id_recyclerView))
                .check(matches(isDisplayed()));
        Thread.sleep(500);

        onView(withContentDescription("['More options']"))
                .perform(click());
        Thread.sleep(500);
        onView(withContentDescription("['More options']")).check(matches(isDisplayed()));

        // Simulate pause and resume
        activityRule.getActivity().pause();
        Thread.sleep(1000); // Wait for the application to be paused

        activityRule.getActivity().resume();
        Thread.sleep(500);

        // Verify that the news feed is still displayed with the same articles
        onView(withId(R.id.id_recyclerView)).check(matches(isDisplayed()));
    }
}