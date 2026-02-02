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
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10214_1021401 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheContinueButtonNavigatesToTheNextSignupPage() throws InterruptedException {
        // Step 1: Click on the 'Continue' button.
        onView(withId(R.id.id_continue_btn)).perform(click());
        
        // Wait for 500ms to ensure navigation is complete
        Thread.sleep(500);
        
        // Expected result: The user is redirected to the next sign-up page.
        // Assuming the next page has a specific view or text that can be used as an assertion
        onView(withText("Next Sign-Up Page Title")).check(matches(isDisplayed()));
    }
}