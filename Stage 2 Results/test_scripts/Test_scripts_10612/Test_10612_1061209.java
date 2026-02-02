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
public class Test_10612_1061209 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnListsOption() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Open the navigation drawer
        onView(withId(R.id.id_drawer_nav_root)).perform(click());

        // Wait for 500ms before proceeding
        Thread.sleep(500);

        // Check if the 'Lists' option is displayed in the drawer
        onView(withText("Lists")).check(matches(isDisplayed()));

        // Wait for 500ms before proceeding
        Thread.sleep(500);
    }
}