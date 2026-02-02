package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ImageButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_13420_1342003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithWindowsLive() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Click on the Windows Live button in the 'Connect with' section
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click());

        // Step 3: Sign in with the provided Windows Live account credentials (Assuming this is handled by a custom action)
        Thread.sleep(500);

        // Step 4: Verify that the user is logged in successfully
        Thread.sleep(500);
        onView(withId(R.id.button_microsoft)).check(matches(withContentDescription("[None]")));
    }
}