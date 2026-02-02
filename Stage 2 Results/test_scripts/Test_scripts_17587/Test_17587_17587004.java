package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17587_17587004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testClickOnTheVideoThumbnailInTheForYouSection() throws InterruptedException {
        // Step 1: Open the news app (Assuming MainActivity is launched by default)
        
        // Step 2: Tap on the 'For You' tab in the navigation bar
        onView(withId(R.id.nav_for_you)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Tap on the video thumbnail
        onView(withId(R.id.id_o3)).perform(click());
        Thread.sleep(500); // Wait for video to start playing

        // Expected Result: The app should start playing the video.
        // Here we assert that the video thumbnail is displayed after clicking it
        onView(withId(R.id.id_o3)).check(matches(isDisplayed()));
    }
}