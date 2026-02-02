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
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10612_1061206 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnSettingsOption() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Open the navigation drawer
        onView(withId(R.id.id_drawer_nav_root)).perform(click());
        
        // Wait for 500ms before proceeding
        Thread.sleep(500);
        
        // Assert that the settings option is displayed
        onView(withText("Settings")).check(matches(isDisplayed()));
    }
}