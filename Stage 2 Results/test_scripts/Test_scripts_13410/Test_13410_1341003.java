package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_13410_1341003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheNavigationBarAtTheBottom() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Full Body Workout' screen.
        Espresso.onView(allOf(withContentDescription("Navigate up"))).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Verify that the navigation bar at the bottom contains a back arrow, a circle, and a square icon.
        // Assuming the icons have content descriptions "back", "circle", and "square" respectively
        Espresso.onView(withContentDescription("back")).check(matches(isDisplayed()));
        Thread.sleep(500); // Wait for UI to update

        Espresso.onView(withContentDescription("circle")).check(matches(isDisplayed()));
        Thread.sleep(500); // Wait for UI to update

        Espresso.onView(withContentDescription("square")).check(matches(isDisplayed()));
    }
}