package com.example.tests;

import android.app.Activity;
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
public class Test_13410_1341008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyInterruptionresume throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Full Body Workout' screen.
        onView(withId(R.id.id_listview)).check(matches(isDisplayed()));

        // Simulate an interruption (e.g., phone call, notification)
        Thread.sleep(500);

        // Resume the app
        Activity activity = activityRule.getActivity();
        activity.moveTaskToBack(false);
        activity.startActivity(activity.getIntent());
        activityRule.waitForActivity();

        // Step 3: Verify that the 'Full Body Workout' screen is still displayed.
        onView(withId(R.id.id_listview)).check(matches(isDisplayed()));
    }
}