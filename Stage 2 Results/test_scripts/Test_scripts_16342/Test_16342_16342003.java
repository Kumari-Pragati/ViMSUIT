package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_16342_16342003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testUiTestVerifyTheStatusBarIconsAndTime() throws InterruptedException {
        // Observe the status bar icons and time.
        Thread.sleep(500); // Wait for 500ms to ensure the UI is fully loaded

        // Use selector: onView(withContentDescription("[None]"))
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));

        Thread.sleep(500); // Wait for 500ms between interactions
    }
}