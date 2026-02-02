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
public class Test_17135_17135008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePostAnAdButtonIsClickableAfterPostingAnAd throws InterruptedException {
        // Step 1: Open the app and navigate to the 'My Messages' section.
        Espresso.onView(withId(R.id.id_drawer_layout)).performClick();
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click on the 'Post an Ad' button.
        Espresso.onView(withId(R.id.post_ad_button_id)).performClick();
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Verify the 'Post an Ad' button is clickable after posting an ad.
        Espresso.onView(withId(R.id.post_ad_button_id)).check(ViewAssertions.matches(isClickable()));
    }
}