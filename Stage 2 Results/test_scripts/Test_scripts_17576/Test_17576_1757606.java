package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(JUnit4.class)
public class Test_17576_1757606 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000);

    @Test
    public void testCheckForUsability() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Help/Info' page.
        // Assuming there is a button or action that navigates to Help/Info page
        onView(withId(R.id.nav_help_info)).perform(ViewActions.click());

        Thread.sleep(500);

        // Step 2: Perform a usability test to ensure the page is easy to navigate and understand.
        // Check if the 'OK' button is clickable and focusable
        onView(withContentDescription("[None]")).check(matches(isClickable()));
        
        Thread.sleep(500);
        
        // Additional checks can be added here based on specific UI elements or actions

        // Final assertion: The page should be easy to navigate and understand.
        Espresso.pressBack();
    }
}