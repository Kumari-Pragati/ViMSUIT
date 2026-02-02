package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_10498_10498001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTheHeadlinesTabAtTheTopOfTheScreen() throws InterruptedException {
        // Wait for the app to start and stabilize
        Thread.sleep(500);

        // Find the 'Headlines' tab in the Toolbar
        onView(allOf(withId(R.id.id_x9), isDisplayed())).perform(click());

        // Wait for 500ms before checking the result
        Thread.sleep(500);

        // Verify that the 'Headlines' tab is visible at the top of the screen
        onView(allOf(withId(R.id.id_x9), isDisplayed())).check(matches(isDisplayed()));
    }
}