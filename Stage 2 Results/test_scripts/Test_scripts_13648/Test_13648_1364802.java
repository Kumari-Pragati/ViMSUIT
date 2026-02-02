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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13648_1364802 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowAttemptingToSelectANonexistentCourseTile() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Similar Courses' screen.
        onView(withId(R.id.id_recycler_view)).perform(ViewActions.click());

        // Step 2: Attempt to tap on a non-existent course tile.
        Thread.sleep(500); // Wait for UI to stabilize

        // Step 3: Verify that no course details page is displayed.
        onView(withId(R.id.course_details_container)).check(ViewAssertions.doesNotExist());
    }
}