package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;

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
public class Test_14804_14804005 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidCountryFlagAndProceed throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Select an invalid country flag
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click());

        // Step 3: Enter a valid phone number in the text input field
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.authorization_phone_number_input)).perform(ViewActions.typeText("1234567890"));

        // Step 4: Click the 'Next' button
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.authorization_next_button)).perform(click());

        // Expected Result: The app should display an error message or not proceed
        Thread.sleep(500);
        onView(withText("Invalid country flag selected")).inRoot(isToast()).check(matches(ViewMatchers.isDisplayed()));
    }
}