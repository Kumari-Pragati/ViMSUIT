package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_10498_10498002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheMainNavigationMenu() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Headlines' section.
        // Assuming that navigating to Headlines is done automatically when the MainActivity starts.

        // Step 2: Click on the downward chevron in the main navigation menu to view more options.
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.id_az4)).perform(click());

        // Expected Result: The main navigation menu should expand to show additional options.
        Thread.sleep(500); // Wait for the menu to expand
        onView(withId(R.id.id_az4)).check(matches(isDisplayed()));
    }
}