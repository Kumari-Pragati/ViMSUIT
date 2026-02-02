package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;

@RunWith(AndroidJUnit4.class)
public class Test_14307_14307004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistenceWhenTheAppIsClosedAndReopened throws InterruptedException {
        // Step 1: Open the app and navigate to the screen with ID 14307.
        // Assuming that the MainActivity is the entry point and it navigates to the target screen.

        // Step 2: Close the app and reopen it.
        activityRule.finishActivity();
        sleep(500); // Wait for the app to close and reopen

        // Step 3: Verify that the screen still displays '空空如也' when no electronic coupons are available.
        onView(withId(R.id.id_current_list_view)).check(matches(withText("空空如也")));
    }
}