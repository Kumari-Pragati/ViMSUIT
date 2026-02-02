package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_13648_1364801 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSelectingACourseTile() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Similar Courses' screen.
        Espresso.onView(withId(R.id.id_recycler_view)).performScrollToPosition(0);
        Thread.sleep(500); // Wait for UI to stabilize

        // Step 2: Tap on the 'C#' course tile.
        Espresso.onView(withText("C#")).performClick();
        Thread.sleep(500); // Wait for UI to stabilize

        // Step 3: Verify that the course details page is displayed.
        Espresso.onView(withId(R.id.course_details_container)).check(ViewAssertions.matches(withText("C#")));
    }
}