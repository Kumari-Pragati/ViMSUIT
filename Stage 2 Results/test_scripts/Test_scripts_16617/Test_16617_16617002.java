package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16617_16617002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheLetsGetStartedButtonAndVerifyNavigationToTheNextScreen throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with elements
        Thread.sleep(500);

        // Step 2: Click on the 'Let's Get Started' button at the bottom of the screen
        onView(withId(R.id.id_continue_button)).performClick();

        // Thread.sleep(500) to allow time for navigation and UI updates
        Thread.sleep(500);

        // Step 3: Verify that the app navigates to the next screen
        // Assuming the next screen has a view with id R.id.next_screen_view_id
        onView(withId(R.id.next_screen_view_id)).check(matches(isDisplayed()));
    }
}