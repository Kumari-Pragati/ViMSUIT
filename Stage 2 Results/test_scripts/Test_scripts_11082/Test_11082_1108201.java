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
public class Test_11082_1108201 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithFacebookPositiveFlow() throws InterruptedException {
        // Step 1: Open the Ticketpop app (Assuming it's already open, this step is implicit)
        
        // Step 2: Click on the 'Login with Facebook' button
        Thread.sleep(500);
        onView(withId(R.id.id_btn_login)).perform(ViewActions.click());

        // Expected Result: The user should be redirected to the Facebook login page.
        Thread.sleep(500);
        Espresso.onView(hasDesc("Facebook")).check(ViewAssertions.matches(isDisplayed()));

        // Expected Result: After successful login, the user should be redirected back to the Ticketpop app.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.main_content)).check(ViewAssertions.matches(isDisplayed()));
    }
}