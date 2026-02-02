package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
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
@LargeTest
public class Test_13897_13897004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testClickOnTheNavigationBarButtons() throws InterruptedException {
        // Step 1: Click on the back button in the navigation bar.
        onView(withId(R.id.drawable_fr_12)).perform(click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Assertion for previous screen
        onView(withId(R.id.home_screen_element_id)).check(matches(isDisplayed()));

        // Step 2: Click on the home button in the navigation bar.
        Thread.sleep(500);
        onView(withId(R.id.drawable_fr_12)).perform(click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Assertion for home screen
        onView(withId(R.id.home_screen_element_id)).check(matches(isDisplayed()));

        // Step 3: Click on the recent apps button in the navigation bar.
        Thread.sleep(500);
        onView(withId(R.id.drawable_fr_12)).perform(click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Assertion for recent apps screen
        onView(withId(R.id.recent_apps_screen_element_id)).check(matches(isDisplayed()));
    }
}