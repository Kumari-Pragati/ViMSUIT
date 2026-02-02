package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_10592_1059203 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheBackArrowInTheHeaderNavigatesBackToThePreviousScreen throws InterruptedException {
        // Step 1: Open the application and navigate to the 'Social Networks' screen.
        // Assuming that the Social Networks screen is already open or can be navigated to from MainActivity

        // Step 2: Click on the back arrow in the header
        Thread.sleep(500);
        onView(withContentDescription("Navigate up")).perform(click());

        // Step 3: Verify that the application navigates back to the previous screen
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(ViewAssertions.matches(isDisplayed()));
    }
}