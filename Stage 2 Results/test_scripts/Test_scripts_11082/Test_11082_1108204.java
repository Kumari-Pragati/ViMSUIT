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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11082_1108204 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSkipButtonPositiveFlow() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 2: Click on the 'Skip' button
        onView(withId(R.id.id_btn_skip)).perform(click());

        // Thread.sleep(500) to allow time for navigation and UI updates
        Thread.sleep(500);

        // Expected result: User should be redirected to the main screen of the Ticketpop app
        // Assuming the main screen has a specific text or view that can be used as an assertion
        onView(withText("Main Screen Title")).check(matches(isDisplayed()));
    }
}