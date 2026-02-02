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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;

@RunWith(AndroidJUnit4.class)
public class Test_1068_1068005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000);

    @Test
    public void testUserCanViewTheirOnlineStatus throws InterruptedException {
        // Wait for the profile view to be clickable and visible
        onView(withId(R.id.id_profile)).perform(ViewActions.click()).check(ViewAssertions.matches(withText("Online for 2 minutes")));

        // Sleep to ensure the online status is updated
        sleep(500);

        // Verify that the online status is displayed correctly
        onView(withId(R.id.id_profile)).check(ViewAssertions.matches(withText("Online for 2 minutes")));
    }
}