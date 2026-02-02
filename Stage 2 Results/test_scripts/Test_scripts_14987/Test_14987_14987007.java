package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(JUnit4.class)
public class Test_14987_14987007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyEmailAddressField() throws InterruptedException {
        // Step 1: Enter 'John Doe' in the 'Full Name' field
        onView(withId(R.id.full_name)).perform(typeText("John Doe"));

        // Step 2: Enter 'Password1234' in the 'Password' field
        onView(withId(R.id.password)).perform(typeText("Password1234"));

        // Step 3: Click the 'SUBMIT' button
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click());

        // Wait for 500ms to ensure the error message is displayed
        Thread.sleep(500);

        // Assert that an error message is shown for the 'Email Address' field
        onView(withId(R.id.email_address_error)).check(matches(ViewMatchers.isDisplayed()));
    }
}