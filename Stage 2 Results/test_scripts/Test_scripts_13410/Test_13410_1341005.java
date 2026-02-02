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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_13410_1341005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectAWorkoutPlan() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Full Body Workout' screen.
        Espresso.onView(withText("Full Body Workout")).perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Select a workout plan from the list by tapping on it.
        onView(withId(R.id.id_listview)).perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The selected workout plan is displayed in detail on the next screen.
        Espresso.onView(withText("Workout Plan Details")).check(matches(isDisplayed()));
    }
}