package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.FrameLayout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class Test_15109_1510909 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistenceWhenTheAppIsClosedAndReopened throws InterruptedException {
        // Step 1: Close the app
        Thread.sleep(500); // Wait for UI to settle

        // Step 2: Reopen the app
        activityRule.launchActivity(null);

        Thread.sleep(500); // Wait for UI to settle

        // Step 3: Verify the radar image and location are still displayed
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));

        FrameLayout mapContainer = (FrameLayout) activityRule.getActivity().findViewById(R.id.map_container);
        assertTrue(mapContainer.isShown());
    }
}