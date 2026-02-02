package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
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
public class Test_10594_1059404 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfSocialMediaIconsForFacebookLinkedinAndGoogle() throws InterruptedException {
        // Thread.sleep to allow the UI to update after opening the app
        Thread.sleep(500);

        // Step 1: Open the SyncMe app and navigate to screen 10594.
        onView(withId(R.id.id_activity_registration__pager)).check(matches(isDisplayed()));

        // Thread.sleep to ensure the view is fully loaded before proceeding
        Thread.sleep(500);

        // Step 2: Verify that the social media icons for Facebook, LinkedIn, and Google+ are present below the profile picture.
        // Assuming the IDs of the social media icons are R.id.facebook_icon, R.id.linkedin_icon, and R.id.google_plus_icon respectively
        onView(withId(R.id.facebook_icon)).check(matches(isDisplayed()));
        Thread.sleep(500);
        onView(withId(R.id.linkedin_icon)).check(matches(isDisplayed()));
        Thread.sleep(500);
        onView(withId(R.id.google_plus_icon)).check(matches(isDisplayed()));

        // Additional assertion to ensure all icons are present
        Espresso.assertAllViewsMatchExpected(new ViewMatchers[] {
                withId(R.id.facebook_icon),
                withId(R.id.linkedin_icon),
                withId(R.id.google_plus_icon)
        }, new boolean[]{true, true, true});
    }
}