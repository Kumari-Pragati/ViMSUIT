package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14143_1414304 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testAccessibilityTestEnsureTheAlreadyAMemberButtonIsAccessible() throws InterruptedException {
        // Open the Lynda.com app.
        // Navigate to the onboarding screen. This step is assumed to be handled by the activity launch.

        // Perform a screen reader test on the 'Already a member?' button.
        Thread.sleep(500); // Wait for UI to stabilize

        onView(withId(R.id.id_login)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to stabilize after click

        // Ensure the 'Already a member?' button is accessible
        Espresso.pressBack(); // Go back to previous screen
        Thread.sleep(500); // Wait for UI to stabilize before assertions

        onView(withId(R.id.id_login)).check(matches(isClickable()));

        // Perform a screen reader test on the 'Already a member?' button.
        // Note: Espresso does not directly support screen reader tests, but we can simulate it by focusing and asserting text
        Thread.sleep(500); // Wait for UI to stabilize

        onView(withId(R.id.id_login)).perform(ViewActions.focus()).check(matches(ViewMatchers.withText("Already a member?")));
    }
}