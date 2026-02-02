package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_14804_14804008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowEnterValidPhoneNumberAndProceed() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Enter a valid phone number in the text input field
        onView(withId(R.id.authorization_phone_input)).perform(ViewActions.typeText("1234567890"));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Click the 'Next' button
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for navigation
        
        // Expected Result: The app should navigate to the next screen
        onView(withId(R.id.next_screen_element)).check(matches(ViewMatchers.isDisplayed()));
    }
}