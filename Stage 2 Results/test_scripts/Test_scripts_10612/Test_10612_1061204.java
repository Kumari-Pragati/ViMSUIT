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
public class Test_10612_1061204 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnLocationSharingOption() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Click on 'Location Sharing' option (CHECK IN)
        onView(withId(R.id.id_checkin_item)).perform(click());

        // Wait for 500ms to allow navigation to the next screen
        Thread.sleep(500);

        // Assert that the app navigates to the 'Location Sharing' settings screen
        onView(withId(R.id.location_sharing_screen_id)).check(matches(isDisplayed()));
    }
}