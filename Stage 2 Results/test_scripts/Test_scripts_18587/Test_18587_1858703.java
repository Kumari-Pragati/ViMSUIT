package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.SimpleDraweeView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_18587_1858703 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUiTestProfileIconClick() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it.
        Thread.sleep(500);

        // Step 1: Open the app (already covered by ActivityTestRule)

        // Step 2: Click on the profile icon in the header/app bar
        onView(withId(R.id.id_avatar)).perform(click());

        // Thread.sleep(500) to ensure the click is processed before checking the result.
        Thread.sleep(500);

        // Expected Result: The profile page for 'appcrawler4' is displayed.
        // Assuming the profile page has a text view with the username 'appcrawler4'
        onView(withText("appcrawler4")).check(matches(withText("appcrawler4")));
    }
}