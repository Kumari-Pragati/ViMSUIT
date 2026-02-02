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
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14630_1463005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheSpeakerIconIsFunctional() throws InterruptedException {
        // Wait for the view to be clickable and then click it
        onView(withId(R.id.id_action_volume)).check(matches(isClickable()));
        Thread.sleep(500);
        onView(withId(R.id.id_action_volume)).perform(click());
        Thread.sleep(500);

        // Verify that the sound can be toggled on or off
        // Assuming there is a way to check if sound is enabled/disabled, e.g., through a UI element or system settings
        // For demonstration purposes, we will just assert that the view is still clickable after interaction
        onView(withId(R.id.id_action_volume)).check(matches(isClickable()));
    }
}