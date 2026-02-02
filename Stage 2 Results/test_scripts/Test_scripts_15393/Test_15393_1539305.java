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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_15393_1539305 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserChecksTheAccessibilityOfTheScreen() throws InterruptedException {
        // Navigate to the 'Your good deed for today' screen (assuming it's the main activity)
        Espresso.onView(withId(R.id.your_good_deed_screen)).check(matches(isDisplayed()));

        // Test each element
        onView(withId(R.id.id_drawer_layout))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.assertAll();

        onView(withContentDescription("['Open side menu']"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.assertAll();

        onView(withContentDescription("[None]"))
                .check(matches(isDisplayed()));
        Thread.sleep(500);
        Espresso.assertAll();
    }
}