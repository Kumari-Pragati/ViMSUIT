package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_16886_16886006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheExpensesSectionIsDisplayedCorrectly throws InterruptedException {
        // Step 1: Open the app and navigate to the property listing screen.
        Thread.sleep(500); // Wait for the app to open

        // Step 2: Verify the expenses section is displayed correctly.
        onView(allOf(withId(R.id.rentalItemRecycler), withContentDescription("[None]")))
                .check(matches(isDisplayed()));

        Thread.sleep(500); // Wait before asserting
    }
}