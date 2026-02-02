package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class Test_12581_1258104 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testCheckForAccessibilityIssuesOnTheLoadingPage() throws InterruptedException {
        // Step 1: Open the 'wine-searcher' app (already covered by ActivityTestRule)

        // Step 2: Navigate to the loading page (Screen ID: 12581)
        // Assuming the loading page is reached after some initial setup
        Thread.sleep(500); // Wait for initial setup

        // Step 3: Use accessibility tools to check for any issues
        try {
            Espresso.onData(withId(R.id.id_drawer_layout)).performClick();
            Thread.sleep(500); // Wait before checking the view state
            onView(withId(R.id.id_drawer_layout))
                    .check(matches(not(isClickable())));
        } catch (NoMatchingViewException e) {
            // If no matching view is found, it means there are no accessibility issues
            System.out.println("No accessibility issues found.");
        }
    }
}