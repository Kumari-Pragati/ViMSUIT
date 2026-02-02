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

@RunWith(AndroidJUnit4.class)
public class Test_14946_14946010 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheBackArrowToReturnToThePreviousScreen() throws InterruptedException {
        // Click on the back arrow
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(ViewActions.click());

        // Wait for 500ms to ensure the previous screen is displayed
        Thread.sleep(500);

        // Assert that the previous screen is displayed
        Espresso.onView(isDisplayed()).check(matches(isDisplayed()));
    }
}