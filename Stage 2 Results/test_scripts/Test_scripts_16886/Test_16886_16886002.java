package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_16886_16886002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheBackArrowNavigatesToThePreviousScreen() throws InterruptedException {
        // Navigate to the property listing screen (assuming it's the main activity)
        Thread.sleep(500); // Wait for the UI to load

        // Click on the back arrow in the header
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait for the navigation to complete

        // Verify the user is navigated back to the previous screen (assuming it's the main activity)
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}