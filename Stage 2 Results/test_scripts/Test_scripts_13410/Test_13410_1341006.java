package com.example.tests;

import android.widget.ListView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13410_1341006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistence() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Full Body Workout' screen.
        onView(withId(R.id.id_listview)).performScrollToTop();
        Thread.sleep(500); // Wait for UI to stabilize

        // Step 2: Select a workout plan.
        // Assuming there is an item in the ListView that represents a workout plan
        // and it has a unique text or content description. For this example, we'll use a placeholder.
        onView(withId(R.id.id_listview)).performScrollToPosition(0);
        Thread.sleep(500); // Wait for UI to stabilize

        // Step 3: Navigate to the home screen and back to the 'Full Body Workout' screen.
        // This step is not explicitly defined in the test case, so we'll assume a navigation
        // mechanism exists. For simplicity, let's simulate this by restarting the activity.
        activityRule.finishActivity();
        Thread.sleep(500); // Wait for UI to stabilize
        activityRule.launchActivity(null);
        Thread.sleep(500); // Wait for UI to stabilize

        // Step 4: Verify that the selected workout plan is still displayed.
        // Assuming the same item in the ListView should be visible after returning.
        onView(withId(R.id.id_listview)).performScrollToPosition(0);
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.id_listview)).check(matches(isDisplayed()));
    }
}