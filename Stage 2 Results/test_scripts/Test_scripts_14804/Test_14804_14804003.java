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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_14804_14804003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowNoInputAndProceed throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Click the 'Next' button without entering a phone number
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Expected Result: The app should display an error message or not proceed
        Espresso.onView(withId(R.id.authorization_phone_input)).check(matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withContentDescription("[None]")).check(matches(ViewMatchers.isNotClickable()));
        Espresso.onView(withId(R.id.authorization_phone_input_error_message))
                .check(matches(ViewMatchers.isDisplayed()))
                .check(matches(ViewAssertions.matches(ViewMatchers.withText("Please enter a valid phone number"))));
    }
}