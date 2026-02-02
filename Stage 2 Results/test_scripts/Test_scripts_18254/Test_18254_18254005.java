package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_18254_18254005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheMenuIcon() throws InterruptedException {
        // Click on the menu icon (assuming it's represented by a button with id R.id.menu_icon)
        onView(withId(R.id.menu_icon)).perform(ViewActions.click());

        // Wait for 500ms to ensure the action is processed
        Thread.sleep(500);

        // Verify that the OK button is displayed after clicking the menu icon
        onView(withId(R.id.id_buttonDefaultPositive)).check(matches(isDisplayed()));

        // Wait for 500ms to ensure the view is updated
        Thread.sleep(500);
    }
}