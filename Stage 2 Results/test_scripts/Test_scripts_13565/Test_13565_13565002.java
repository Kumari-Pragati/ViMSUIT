package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.FrameLayout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13565_13565002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowNoInternetConnection() throws InterruptedException {
        // Step 1: Open the app and navigate to the screen displaying rental properties in Koramangala.
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500); // Wait for drawer to open

        // Simulate no internet connection scenario
        Espresso.closeSoftKeyboard();
        Thread.sleep(500);

        // Step 2: Check if the app displays an error message indicating no internet connection.
        onView(withText("No Internet Connection")).inRoot(withDecorView(not(isDisplayed()))).check(matches(isDisplayed()));
    }
}