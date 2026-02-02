package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_12188_12188006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5000); // Set a reasonable timeout

    @Test
    public void testNegativeFlowUserClicksMaybeLaterButtonAndThenMaybeLaterButton throws InterruptedException {
        // Step 1: Open the application (Assuming it's already open, or you can add an intent to launch MainActivity)

        // Step 2: Navigate to the onboarding screen (Assuming onboarding is launched automatically)
        
        // Step 3: Click on the 'Maybe Later' button
        onView(withId(R.id.id_fragment_onboarding_introduction_maybe_later_button)).perform(click());
        Thread.sleep(500); // Wait for UI updates

        // Step 4: Click on the 'Maybe Later' button again
        onView(withId(R.id.id_fragment_onboarding_introduction_maybe_later_button)).perform(click());
        Thread.sleep(500); // Wait for UI updates

        // Expected Result: The application should remain on the onboarding screen.
        // The 'Maybe Later' button should be disabled after the first click.
        onView(withId(R.id.id_fragment_onboarding_introduction_maybe_later_button)).check(ViewAssertions.matches(isClickable(false)));
    }
}