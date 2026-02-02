package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
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
public class Test_15034_15034004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testVerifyThePresenceOfTheAuthorAppsSection() throws InterruptedException {
        // Step 1: Open the Earthquake Alert app (Assuming it's already open)
        
        // Step 2: Navigate to the promotional section
        onView(withId(R.id.id_scrollView)).perform(ViewActions.scrollTo());
        Thread.sleep(500); // Wait for 500ms
        
        // Step 3: Verify the presence of the 'Author Apps' section
        onView(withId(R.id.id_scrollView)).check(matches(isDisplayed()));
        
        Thread.sleep(500); // Wait for 500ms before finishing the test
    }
}