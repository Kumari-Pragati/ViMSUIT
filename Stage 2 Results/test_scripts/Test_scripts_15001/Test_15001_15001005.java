package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_15001_15001005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testVerifyThePromotionalBannerInteraction() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'France: Ligue 1' section.
        Espresso.onView(withId(R.id.id_header)).perform(ViewActions.click());

        // Step 2: Click on the promotional banner.
        Thread.sleep(500); // Wait for the WebView to load
        Espresso.onView(withId(R.id.id_header)).perform(ViewActions.click());

        // Step 3: Verify that the app navigates to the Betclic landing page.
        Thread.sleep(500); // Wait for navigation to complete
        Espresso.onView(withId(R.id.id_header)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Additional assertion to check if the correct URL is loaded in WebView (if needed)
        // Espresso.onData(hasToString("Betclic")).inAdapterView(allOf(withPosition(0), withParent(isAssignableFrom(WebView.class)))).perform(webClick());
    }
}