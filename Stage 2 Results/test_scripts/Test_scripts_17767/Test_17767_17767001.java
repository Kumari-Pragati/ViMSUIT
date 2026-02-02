package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ImageView;

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
public class Test_17767_17767001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testOpenCameraAndTakeAPhoto() throws InterruptedException {
        // Step 1: Open the app and navigate to the camera screen (assumed by ActivityTestRule)
        
        // Step 2: Click on the large white camera icon at the bottom of the screen to take a photo
        onView(withId(R.id.id_shutter_button)).perform(click());
        Thread.sleep(500); // Wait for the shutter button click to process

        // Expected Result: A photo should be taken and saved to the app's photo gallery
        // Assuming there is an ImageView that displays the last taken photo
        ImageView imageView = activityRule.getActivity().findViewById(R.id.last_taken_photo);
        onView(withId(R.id.last_taken_photo)).check(matches(isDisplayed()));
    }
}