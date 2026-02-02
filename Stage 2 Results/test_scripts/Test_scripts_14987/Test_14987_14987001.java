package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Toast;

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
public class Test_14987_14987001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSuccessfulRegistration() throws InterruptedException {
        // Step 1: Enter 'John Doe' in the 'Full Name' field
        onView(withId(R.id.full_name)).perform(typeText("John Doe"));
        Thread.sleep(500);

        // Step 2: Enter 'john.doe@example.com' in the 'Email Address' field
        onView(withId(R.id.email_address)).perform(typeText("john.doe@example.com"));
        Thread.sleep(500);

        // Step 3: Enter 'Password1234' in the 'Password' field
        onView(withContentDescription("[None]")).perform(typeText("Password1234"));
        Thread.sleep(500);

        // Step 4: Click the 'SUBMIT' button
        onView(withId(R.id.submit_button)).perform(click());
        Thread.sleep(500);

        // Expected Result: The user is redirected to the home screen with a success message
        onView(ViewMatchers.withText("Registration successful")).inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(Toast.class)))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}