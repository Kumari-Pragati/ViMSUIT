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
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1809_1809001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowStartTheSortingQuiz() throws InterruptedException {
        // Thread.sleep to ensure the app has time to initialize and load resources
        Thread.sleep(500);

        // Step 1: Open the app (already covered by ActivityTestRule)

        // Step 2: Locate and press the 'START' button
        onView(withId(R.id.id_startbtn)).perform(click());

        // Thread.sleep to ensure the transition is complete before assertion
        Thread.sleep(500);

        // Expected result: The app should transition to the next screen of the Sorting Quiz
        // Assuming the next screen has a specific view or id, we can assert that.
        // For example, if the next screen has an id R.id.next_screen_view:
        onView(withId(R.id.next_screen_view)).check(matches(isDisplayed()));
    }
}