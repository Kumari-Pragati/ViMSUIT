package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(JUnit4.class)
public class Test_16886_16886004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheImageIsDisplayedCorrectly() throws InterruptedException {
        // Step 1: Open the app and navigate to the property listing screen.
        Espresso.onView(ViewMatchers.withText("Property Listing")).perform(ViewActions.click());

        // Step 2: Verify the image of the property's entrance is displayed correctly.
        Thread.sleep(500); // Wait for UI to update

        onView(withContentDescription("[None]"))
                .check(matches(isDisplayed()));

        Thread.sleep(500); // Wait for UI to stabilize
    }
}