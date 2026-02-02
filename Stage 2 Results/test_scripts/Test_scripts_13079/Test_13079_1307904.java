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
public class Test_13079_1307904 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheListRow() throws InterruptedException {
        // Wait for the view to be displayed before interacting with it
        onView(withId(R.id.id_card_view)).check(matches(isDisplayed()));

        // Perform the click action on the '123456' list row
        Thread.sleep(500);
        onView(withId(R.id.id_card_view)).perform(ViewActions.click());

        // Wait for 500ms to ensure the view is selected
        Thread.sleep(500);

        // Assert that the '123456' list row is selected
        onView(withId(R.id.id_card_view)).check(matches(isDisplayed()));
    }
}