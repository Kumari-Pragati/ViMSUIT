package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_1863_186301 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTheBackArrowInTheHeader() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Open the app and navigate to the screen with the header containing the back arrow
        // For demonstration, we assume that navigating to this screen is done through some action in MainActivity

        // Wait for 500ms to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Use selector: onView(withContentDescription("['Navigate up']"))
        onView(withContentDescription("Navigate up")).check(matches(isDisplayed()));

        // Wait for 500ms between interactions
        Thread.sleep(500);
    }
}