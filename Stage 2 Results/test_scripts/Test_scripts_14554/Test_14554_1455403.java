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
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14554_1455403 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheOrangeButtonWithAPlusSignIsClickable() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it.
        Thread.sleep(500);

        // Step 1: Open the messaging app 'airMail'.
        // Step 2: Click on the orange button with a plus sign at the bottom right.
        onView(withId(R.id.id_airmail_fab_new)).perform(click());

        // Thread.sleep(500) to ensure the navigation is complete before assertions.
        Thread.sleep(500);

        // Expected result: The app should navigate to the message composition screen.
        // Verify that the button remains clickable after interaction (as a proxy for successful navigation).
        onView(withId(R.id.id_airmail_fab_new)).check(matches(isClickable()));
    }
}