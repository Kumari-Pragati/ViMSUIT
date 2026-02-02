package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10594_1059406 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheScreenIsAccessibleAndUsable() throws InterruptedException {
        // Element 1: withId(R.id.id_activity_registration__pager)
        onView(withId(R.id.id_activity_registration__pager))
                .perform(click())
                .check(matches(isClickable()));
        Thread.sleep(500);

        // Element 2: withId(R.id.id_map)
        onView(withId(R.id.id_map))
                .perform(click())
                .check(matches(isClickable()));
        Thread.sleep(500);

        // Element 3: withId(R.id.id_fragment_phone_insertion__welcomeContinueButton)
        onView(withId(R.id.id_fragment_phone_insertion__welcomeContinueButton))
                .perform(click())
                .check(matches(isClickable()));
        Thread.sleep(500);

        // Element 4: withContentDescription("['Google Map']")
        onView(withContentDescription("['Google Map']"))
                .perform(click())
                .check(matches(isClickable()));
        Thread.sleep(500);
    }
}