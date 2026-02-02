package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ScrollView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_12775_12775006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForDataPersistenceAfterAppRestart() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_howto))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_howto)).check(matches(isDisplayed()));

        onView(withId(R.id.id_sliding_tabs))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_sliding_tabs)).check(matches(isDisplayed()));

        onView(withId(R.id.id_pager))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_pager)).check(matches(isDisplayed()));

        onView(withId(R.id.id_my_recycler_view))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_my_recycler_view)).check(matches(isDisplayed()));

        for (int i = 1; i <= 8; i++) {
            String contentDescription = "[None] " + i;
            onView(withContentDescription(contentDescription))
                    .perform(click());
            Thread.sleep(500);
            // Verify state
            onView(withContentDescription(contentDescription)).check(matches(isDisplayed()));
        }
    }
}