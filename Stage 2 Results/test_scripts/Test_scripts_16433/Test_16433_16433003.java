package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.RecyclerView;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertTrue;

@RunWith(androidx.test.runner.AndroidJUnit4.class)
@LargeTest
public class Test_16433_16433003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Ensure the app is launched before each test
        activityRule.getScenario().onActivity(activity -> {
            InstrumentationRegistry.getInstrumentation().waitForIdleSync();
        });
    }

    @Test
    public void testNegativeFlowAttemptingToDownloadANonfreeWidget throws InterruptedException {
        // Step 1: Open the mobile app (already handled by ActivityTestRule)
        
        // Step 2: Navigate to the 'Gallery' screen
        onView(withId(R.id.id_recycler_view)).perform(ViewActions.scrollToPosition(0));
        Thread.sleep(500); // Wait for RecyclerView to load
        
        // Step 3: Click on the 'Download' button of a non-free weather widget
        onView(withId(R.id.id_recycler_view)).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Expected Result: An error message is displayed indicating that the widget is not free.
        onView(ViewMatchers.withText("This widget requires a subscription")).check(matches(ViewMatchers.isDisplayed()));
    }
}