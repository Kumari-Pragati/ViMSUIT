package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1863_186305 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheHowtoButtonFunctionality() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 1: Open the app and navigate to the screen with the 'how-to' button.
        // Assuming the how-to button is on the main activity or a specific fragment

        // Step 2: Click on the 'how-to' button
        onView(withId(R.id.id_showHintsButton)).perform(click());

        // Thread.sleep(500) to ensure the navigation is completed before assertions
        Thread.sleep(500);

        // Expected result: The app should navigate to the 'how-to' screen.
        // Assuming there's a specific view or text that indicates we are on the how-to screen
        onView(withText("How-To Screen Title")).check(matches(isDisplayed()));
    }
}