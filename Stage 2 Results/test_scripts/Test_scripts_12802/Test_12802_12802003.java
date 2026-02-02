package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_12802_12802003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryvalidationEmptyMusicHistory() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it.
        Thread.sleep(500);

        // Navigate to the Music History screen (assuming there's an action or button to navigate)
        Espresso.onView(allOf(withId(R.id.id_recyclerview))).check(ViewAssertions.matches(withText("No music history entries")));

        // Thread.sleep(500) between interactions
        Thread.sleep(500);
    }
}