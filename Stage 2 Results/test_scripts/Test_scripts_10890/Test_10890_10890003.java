package com.example.tests;

import android.support.test.rule.ActivityTestRule;
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
public class Test_10890_10890003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheLaterButtonFunctionality() throws InterruptedException {
        // Wait for the UI to load
        Thread.sleep(500);

        // Click on the 'LATER' button
        onView(withId(R.id.id_cancel_button)).perform(click());

        // Wait for the UI to update
        Thread.sleep(500);

        // Assert that the promotional overlay is dismissed
        onView(withId(R.id.promo_overlay)).check(matches(not(isDisplayed())));
    }
}