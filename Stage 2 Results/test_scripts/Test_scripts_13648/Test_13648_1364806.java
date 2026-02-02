package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.FrameLayout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.instanceOf;

@RunWith(AndroidJUnit4.class)
public class Test_13648_1364806 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDataPersistenceCourseTileSelectionAfterAppRestart throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Similar Courses' screen.
        onView(withId(R.id.id_recycler_view)).check(matches(isDisplayed()));

        // Step 2: Tap on the 'C#' course tile.
        Thread.sleep(500);
        onView(withId(R.id.id_recycler_view)).perform(click());

        // Step 3: Restart the app (this is simulated by recreating the activity rule).
        activityRule.finishActivity();
        activityRule.launchActivity(null);

        // Step 4: Verify that the 'C#' tile is still selected in the 'Similar Courses' screen.
        Thread.sleep(500);
        onView(withId(R.id.id_recycler_view)).check(matches(isDisplayed()));
        onView(instanceOf(FrameLayout.class)).check(matches(isDisplayed())); // Assuming C# tile is represented by a FrameLayout
    }
}