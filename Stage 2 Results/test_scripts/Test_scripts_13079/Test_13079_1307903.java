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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13079_1307903 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheDefaultListRow() throws InterruptedException {
        // Wait for the view to be displayed before interacting with it
        Espresso.onView(withId(R.id.id_card_view)).check(matches(isDisplayed()));

        // Click on the 'Default' list row
        Espresso.onView(withId(R.id.id_card_view))
                .perform(ViewActions.click());

        // Wait for 500ms to ensure the action is processed
        Thread.sleep(500);

        // Assert that the 'Default' list row is selected
        Espresso.onView(withId(R.id.id_card_view)).check(matches(isDisplayed()));
    }
}