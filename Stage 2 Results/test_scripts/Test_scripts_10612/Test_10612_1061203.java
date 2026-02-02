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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10612_1061203 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnJoinACircleButton() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Click on the 'Join a Circle' button
        onView(withId(R.id.id_join_circle_button)).perform(click());

        // Wait for the new screen to load
        Thread.sleep(500);

        // Assert that the Join a Circle screen is displayed
        onView(withId(R.id.join_a_circle_screen_id)).check(matches(isDisplayed()));
    }
}