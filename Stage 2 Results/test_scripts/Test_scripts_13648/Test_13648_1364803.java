package com.example.tests;

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
public class Test_13648_1364803 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationEmptyCourseTileSelection() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Similar Courses' screen.
        // Assuming that navigating to the Similar Courses screen is done by default when MainActivity starts.

        // Step 2: Do not select any course tile.
        Thread.sleep(500); // Wait for UI to stabilize

        // Step 3: Verify that the screen remains on the 'Similar Courses' screen.
        onView(withId(R.id.id_recycler_view)).check(matches(isDisplayed()));

        Thread.sleep(500); // Additional wait time
    }
}