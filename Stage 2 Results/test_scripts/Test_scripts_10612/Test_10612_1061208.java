package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10612_1061208 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnHelpAlertOption() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before proceeding
        Thread.sleep(500);

        // Step 1: Open the app and navigate to screen 10612.
        // Assuming that navigating to screen 10612 involves some action like clicking a menu item or swiping

        // Step 2: Click on the 'Help Alert' option
        onView(withId(R.id.id_checkin_item)).perform(click());

        // Thread.sleep(500) to ensure the navigation is complete before proceeding
        Thread.sleep(500);

        // Expected Result: The app navigates to the 'Help Alert' screen.
        // Assuming that the 'Help Alert' screen has a specific text or view identifier
        onView(withText("HELP ALERT")).check(matches(isDisplayed()));
    }
}