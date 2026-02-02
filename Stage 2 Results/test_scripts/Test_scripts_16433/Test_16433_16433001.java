package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16433_16433001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigatingToTheGalleryScreen() throws InterruptedException {
        // Navigate to the 'Gallery' screen

        // Test Element 1: withId(R.id.id_img_back_btn)
        onView(withId(R.id.id_img_back_btn)).perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_recycler_view)).check(matches(isDisplayed()));

        // Test Element 2: withId(R.id.id_recycler_view)
        onView(withId(R.id.id_recycler_view)).perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_img_back_btn)).check(matches(isDisplayed()));
    }
}