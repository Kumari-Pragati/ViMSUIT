package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.AbsListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_16112_16112005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheHistoryTabIsAccessibleAndUsable() throws InterruptedException {
        // Navigate to the HISTORY tab
        onView(withId(R.id.id_sliding_tabs))
                .perform(click());
        Thread.sleep(500);
        
        // Verify that all elements are accessible and usable

        // Element 1: withId(R.id.id_action_search)
        onView(allOf(withId(R.id.id_action_search), isDisplayed()))
                .perform(click());
        Thread.sleep(500);

        // Element 2: withId(R.id.id_sliding_tabs) - already navigated to HISTORY tab
        // Element 3: withId(R.id.id_viewpager) - already navigated to HISTORY tab

        // Element 4: withId(R.id.id_clearAll)
        onView(allOf(withId(R.id.id_clearAll), isDisplayed()))
                .perform(click());
        Thread.sleep(500);

        // Element 5: withId(R.id.id_history_recycler_view) - verify visibility
        onView(allOf(withId(R.id.id_history_recycler_view), isDisplayed()))
                .check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 6: withId(R.id.id_delete)
        onView(allOf(withId(R.id.id_delete), isDisplayed()))
                .perform(click());
        Thread.sleep(500);

        // Element 7: withContentDescription("[None]") - verify visibility
        onView(withContentDescription("[None]"))
                .check(matches(isDisplayed()));
    }
}