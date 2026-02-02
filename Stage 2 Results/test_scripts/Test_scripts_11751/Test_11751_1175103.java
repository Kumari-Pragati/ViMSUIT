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
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11751_1175103 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(20000); // Set a longer timeout for the test

    @Test
    public void testSelectABusRoute() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Bus Routes' screen.
        Thread.sleep(500);

        // Step 2: Tap on a bus route (e.g., Route 20) in the list.
        onView(withId(R.id.id_listView1)).perform(click());
        Thread.sleep(500);

        // Expected Result: The app navigates to the detailed information screen for the selected bus route.
        Espresso.onView(withText("Route 20")).check(matches(isDisplayed()));
    }
}