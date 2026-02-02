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
public class Test_18254_18254002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheOkButton() throws InterruptedException {
        // Wait for the view to be displayed before interacting with it
        Espresso.onView(withId(R.id.id_buttonDefaultPositive)).check(matches(isDisplayed()));

        // Click on the 'OK' button
        Espresso.onView(withId(R.id.id_buttonDefaultPositive))
                .perform(ViewActions.click());

        // Add a sleep to ensure the UI has enough time to process the click event
        Thread.sleep(500);

        // Assert that the view is still displayed after the interaction (optional)
        Espresso.onView(withId(R.id.id_buttonDefaultPositive)).check(matches(isDisplayed()));
    }
}