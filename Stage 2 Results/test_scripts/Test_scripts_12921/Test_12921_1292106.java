package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_12921_1292106 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testFooterNavigation() throws InterruptedException {
        // Step 1: Click on the 'EXPLORE' icon in the footer.
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms

        // Step 2: Click on the 'SAVED' icon in the footer.
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms

        // Step 3: Click on the 'TRIPS' icon in the footer.
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms

        // Assertion: The screen should navigate to the respective sections in the footer
        Espresso.onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}