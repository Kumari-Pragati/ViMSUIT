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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_13410_1341002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateBackToThePreviousScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Full Body Workout' screen.
        Espresso.onView(withId(R.id.full_body_workout_screen)).check(matches(isDisplayed()));

        // Step 2: Click on the back arrow in the header to navigate back to the previous screen.
        Thread.sleep(500);
        onView(withContentDescription("Navigate up")).perform(ViewActions.click());

        // Expected Result: The user is navigated back to the previous screen.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.previous_screen_id)).check(matches(isDisplayed()));
    }
}