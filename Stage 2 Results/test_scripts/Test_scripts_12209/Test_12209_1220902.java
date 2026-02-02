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

@RunWith(AndroidJUnit4.class)
public class Test_12209_1220902 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheTicketmasterAd throws InterruptedException {
        // Wait for the view to be clickable and visible
        Thread.sleep(500);
        
        // Find the scroll view with id R.id.id_scroll_view
        onView(withId(R.id.id_scroll_view))
                .perform(ViewActions.click())
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Wait for 500ms to ensure the redirection happens
        Thread.sleep(500);

        // Perform any additional checks if necessary, e.g., checking URL or toast message
        // For example:
        // onView(withText("Ticketmaster Website"))
        //     .inRoot(isToast())
        //     .check(matches(isDisplayed()));
    }
}