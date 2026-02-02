package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_10482_1048202 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5000); // Set a longer timeout for the test

    @Test
    public void testEnterInvalidPhoneNumber() throws InterruptedException {
        // Navigate to the 'Phone for Checkout' screen (assuming it's already on this screen)
        
        // Tap on the text input field labeled 'Phone'
        onView(withId(R.id.id_editTextField)).perform(click());
        
        Thread.sleep(500); // Wait for 500ms
        
        // Enter the phone number '123-456-789'
        onView(withId(R.id.id_editTextField)).perform(typeText("123-456-789"));
        
        Thread.sleep(500); // Wait for 500ms
        
        // Verify that an error message is displayed indicating an invalid phone number
        onView(withText("Invalid phone number")).check(matches(isDisplayed()));
    }
}