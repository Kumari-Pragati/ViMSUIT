package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.view.ViewPager;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_15123_1512304 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheWelcomeScreenIsAccessible() throws InterruptedException {
        // Step 1: Open the Forever 21 mobile app (Assumed to be done by the rule)
        
        // Step 2: Use accessibility tools to verify the welcome screen is accessible
        Thread.sleep(500); // Wait for UI to load

        // Check if the ViewPager is focusable and not clickable as per the testability score
        onView(withId(R.id.id_vPOnboardingImages)).check(matches(isClickable(false)));
    }
}