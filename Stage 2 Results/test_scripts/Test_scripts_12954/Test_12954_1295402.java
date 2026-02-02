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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_12954_1295402 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAddANewWallet() throws InterruptedException {
        // Test each element
        onView(withContentDescription("['Navigate up']"))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(allOf(withId(R.id.accountsList), isDisplayed()))
                .check(matches(isDisplayed()));

        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(allOf(withId(R.id.accountsList), isDisplayed()))
                .check(matches(isDisplayed()));

        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(allOf(withId(R.id.accountsList), isDisplayed()))
                .check(matches(isDisplayed()));
    }
}