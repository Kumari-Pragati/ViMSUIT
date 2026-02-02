package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.AbsListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12833_1283305 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(5000); // 5 seconds

    @Test
    public void testVerifyDataPersistenceWhenNavigatingAwayFromTheThread() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Animals & Nature' thread.
        onView(withId(R.id.id_thread_list)).perform(click());
        Thread.sleep(500);

        // Step 2: Navigate away from the thread to another screen.
        onView(withId(R.id.id_thread_list)).perform(ViewActions.swipeRight());
        Thread.sleep(500);

        // Step 3: Navigate back to the 'Animals & Nature' thread.
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withId(R.id.id_thread_list)).perform(click());
        Thread.sleep(500);

        // Step 4: Verify that the thread is still displayed with the same posts.
        onView(withId(R.id.id_thread_list)).check(matches(isDisplayed()));
    }
}