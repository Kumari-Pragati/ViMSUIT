package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15287_1528702 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignUpWithEmptyFields() throws InterruptedException {
        // Step 1: Click the 'SIGN UP' button
        onView(withId(R.id.id_sign_up_button)).perform(click());
        
        // Wait for UI to update
        Thread.sleep(500);
        
        // Expected result: An error message is displayed indicating that all fields are required
        onView(withText("All fields are required")).check(ViewAssertions.matches(isDisplayed()));
    }
}