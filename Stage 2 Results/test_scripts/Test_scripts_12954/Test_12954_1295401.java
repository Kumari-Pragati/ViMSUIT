package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_12954_1295401 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAddressesScreen() throws InterruptedException {
        // Navigate up element
        onView(withContentDescription("['Navigate up']"))
                .perform(click());
        Thread.sleep(500);
        // Verify the Addresses screen is displayed
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
        
        // Wallets section element
        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        // Verify Wallets and Imported Addresses sections are visible
        onView(withContentDescription("Wallets")).check(matches(isDisplayed()));
        onView(withContentDescription("Imported Addresses")).check(matches(isDisplayed()));

        // Imported Addresses section element (assuming it's the same as Wallets for simplicity)
        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        // Verify Wallets and Imported Addresses sections are visible
        onView(withContentDescription("Wallets")).check(matches(isDisplayed()));
        onView(withContentDescription("Imported Addresses")).check(matches(isDisplayed()));
    }
}