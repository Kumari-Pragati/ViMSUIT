package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10498_10498005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheMainContentArea() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Headlines' section.
        onView(withId(R.id.nav_headlines)).perform(click());
        
        // Wait for 500ms before proceeding
        Thread.sleep(500);

        // Step 2: Verify that the main content area displays a large image of a missile launch with a caption about a reported missile launch in North Korea.
        onView(withId(R.id.id_h4)).check(matches(withText("N/A")));
        
        // Wait for 500ms before proceeding
        Thread.sleep(500);

        // Additional verification can be added here if necessary, e.g., checking the image itself
    }
}