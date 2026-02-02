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
public class Test_12188_12188003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserClicksMaybeLaterButtonMultipleTimes() throws InterruptedException {
        // Navigate to the onboarding screen (assuming it's the first screen)
        
        // Test 'Maybe Later' button
        onView(withId(R.id.id_fragment_onboarding_introduction_maybe_later_button))
                .perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_fragment_onboarding_introduction_maybe_later_button))
                .check(matches(not(isClickable())));  // Verify it's disabled after the first click

        // Test 'Next' button
        onView(withId(R.id.id_fragment_onboarding_introduction_next_button))
                .perform(click());
        Thread.sleep(500);
        // Assuming Next button should not be clickable on the onboarding screen, verify its state if needed
    }
}