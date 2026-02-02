package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_1753_1753003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTwoBulletPointsDescribingTheBenefitsOfSavingRoutes() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 1: Open the app and navigate to screen 1753 (assuming this is a placeholder for actual navigation logic)
        Espresso.onView(withId(R.id.id_ib_showimage_kmp)).performClick();

        // Thread.sleep(500) to ensure the UI updates after the click
        Thread.sleep(500);

        // Step 2: Verify that there are two bullet points describing the benefits of saving routes
        Espresso.onView(allOf(
                withText("• Benefit 1"),
                isDisplayed()
        )).check(matches(isDisplayed()));

        Espresso.onView(allOf(
                withText("• Benefit 2"),
                isDisplayed()
        )).check(matches(isDisplayed()));
    }
}