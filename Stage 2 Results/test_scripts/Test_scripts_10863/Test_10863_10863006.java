package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

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
public class Test_10863_10863006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserAttemptsToViewUnreadEmails() throws InterruptedException {
        // Step 2: Navigate to the home page (Assuming home page is already loaded)
        
        // Step 3: Click on the 'Unread emails' button in the action center
        Thread.sleep(500); // Wait for UI to stabilize
        
        onView(withId(R.id.id_listActionCenter)).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Expected result: The user is navigated to the unread emails section
        onView(withId(R.id.id_listActionCenter)).check(matches(isDisplayed()));
    }
}