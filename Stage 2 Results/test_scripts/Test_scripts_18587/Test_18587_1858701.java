package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_18587_1858701 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigateToProfilePage() throws InterruptedException {
        // Step 1: Open the app (already done by ActivityTestRule)

        // Step 2: Navigate to the profile page for 'appcrawler4'
        onView(withId(R.id.id_mainMenu)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The title 'appcrawler4' is visible in the center of the screen
        onView(withText("appcrawler4")).check(matches(isDisplayed()));
    }
}