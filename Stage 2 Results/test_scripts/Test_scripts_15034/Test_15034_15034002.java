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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15034_15034002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheAboutOptionInTheHeader() throws InterruptedException {
        // Step 1: Open the Earthquake Alert app (Assuming it's already open)

        // Step 2: Navigate to the promotional section
        onView(withText("Get it on Google Play")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Click on the 'About' option in the header
        onView(withId(R.id.id_earthquake_alert_button)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should navigate to the 'About' section
        onView(withText("About")).check(matches(isDisplayed()));
    }
}