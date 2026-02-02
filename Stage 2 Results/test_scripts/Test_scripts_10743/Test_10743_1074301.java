package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10743_1074301 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserNavigatesToTheGetConnectedScreen() throws InterruptedException {
        // Thread.sleep(500) to ensure the app has enough time to initialize and load resources.
        Thread.sleep(500);

        // Step 1: Open the fitness app (assumed to be done by ActivityTestRule)
        // Step 2: Navigate to the 'GET CONNECTED' screen
        onView(withId(R.id.id_connect_apps_devices)).performClick();
        
        // Wait for 500ms before checking the result.
        Thread.sleep(500);
        
        // Assert that the 'GET CONNECTED' screen is displayed
        onView(withId(R.id.id_connect_apps_devices)).check(matches(isDisplayed()));
    }
}