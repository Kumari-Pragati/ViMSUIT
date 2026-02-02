package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_1863_186307 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheHowtoAndPlayButtonsAreClickable() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_showHintsButton))
                .perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_showHintsButton)).check(matches(isClickable()));

        onView(withContentDescription("['Navigate up']"))
                .perform(click());
        Thread.sleep(500);
        onView(withContentDescription("['Navigate up']")).check(matches(isClickable()));

        onView(withId(R.id.id_hintStartButton))
                .perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_hintStartButton)).check(matches(isClickable()));
    }
}