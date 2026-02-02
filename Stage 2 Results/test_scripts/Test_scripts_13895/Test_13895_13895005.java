package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_13895_13895005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUiTestBackArrowButton() throws InterruptedException {
        // Navigate to the gallery screen (assuming it's the second screen)
        Thread.sleep(500); // Wait for the app to load and stabilize

        // Tap on the back arrow button in the top left corner
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait before checking the result

        // Assert that the previous screen is displayed
        onView(withId(R.id.previous_screen_id)).check(matches(isDisplayed()));
    }
}