package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(JUnit4.class)
public class Test_10183_10183003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserCancelsTheRedirectionMultipleTimes() throws InterruptedException {
        // Wait for the loading screen to appear (assuming it has a specific view or time)
        Thread.sleep(500);

        // Click on the 'Cancel' button
        onView(withContentDescription("Navigate up")).perform(click());

        // Verify the message is still displayed
        Thread.sleep(500);
        onView(ViewMatchers.withText("Please wait while we send you to your provider to log in..."))
                .check(matches(isDisplayed()));

        // Click on the 'Cancel' button again
        Thread.sleep(500);
        onView(withContentDescription("Navigate up")).perform(click());

        // Verify the message is still displayed
        Thread.sleep(500);
        onView(ViewMatchers.withText("Please wait while we send you to your provider to log in..."))
                .check(matches(isDisplayed()));

        // Wait for the app to redirect the user to the provider's login page (assuming it has a specific view or time)
        Thread.sleep(500);

        // Assert that the user is not redirected
        onView(ViewMatchers.withText("Please wait while we send you to your provider to log in..."))
                .check(matches(isDisplayed()));
    }
}