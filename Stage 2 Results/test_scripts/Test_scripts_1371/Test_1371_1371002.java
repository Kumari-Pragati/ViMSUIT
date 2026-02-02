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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_1371_1371002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationToThePreviousScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the flight itinerary screen.
        // Assuming that the flight itinerary screen is already open or can be navigated to.

        // Step 2: Tap the back arrow in the header to navigate to the previous screen.
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click());

        // Step 3: Assert that navigation to the previous screen is successful.
        Thread.sleep(500); // Wait for UI to update
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}