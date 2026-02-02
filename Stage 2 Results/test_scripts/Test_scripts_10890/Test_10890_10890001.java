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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10890_10890001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfThePromotionalOverlay() throws InterruptedException {
        // Step 2: Check if the promotional overlay for Sololearn app is displayed.
        onView(withId(R.id.id_cancel_button)).check(matches(isDisplayed()));

        // Sleep to ensure UI updates are completed before proceeding
        Thread.sleep(500);
    }
}