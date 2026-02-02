package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10636_1063603 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheVideosSection() throws InterruptedException {
        // Tap on the 'Videos' tab in the navigation bar
        onView(withId(R.id.id_tablayout)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms to ensure the transition is complete

        // Verify that the 'Videos' section of the Champions League coverage is displayed
        Espresso.onView(withText("Champions League")).check(matches(withText("Champions League")));
    }
}