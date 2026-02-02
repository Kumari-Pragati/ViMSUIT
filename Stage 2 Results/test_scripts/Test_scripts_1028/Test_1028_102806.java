package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1028_102806 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnDoneButton() throws InterruptedException {
        // Navigate to the Weather Notifications screen (assuming it's already on this screen)
        
        // Click on the 'Done' button at the bottom
        onView(withId(R.id.id_station_logo)).perform(click());
        Thread.sleep(500); // Wait for 500ms

        // Verify that the screen returns to the previous screen
        onView(withId(R.id.id_previous_screen_element_id)).check(matches(isDisplayed()));
    }
}