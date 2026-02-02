package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatSeekBar;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_14630_1463004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheProgressSliderIsFunctional() throws InterruptedException {
        // Wait for the app to start and the progress slider to be available
        Thread.sleep(500);

        // Interact with the progress slider in the header
        onView(withContentDescription("[None]")).perform(click());

        // Wait before checking the state of the progress slider
        Thread.sleep(500);

        // Check if the progress slider is clickable (should be true)
        onView(withContentDescription("[None]")).check(matches(isClickable()));

        // Additional assertions can be added here to verify other states or behaviors of the progress slider
    }
}