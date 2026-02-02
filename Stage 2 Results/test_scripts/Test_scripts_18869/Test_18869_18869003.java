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
public class Test_18869_18869003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowCreateANewAccountWithoutEnteringEmail throws InterruptedException {
        // Open the app and navigate to the login screen (assumed to be the default)
        
        // Click on the 'NEW ACCOUNT' title
        onView(withId(R.id.new_account_title)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Click on the 'CREATE ACCOUNT' button
        onView(withId(R.id.id_reset_pass)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Assert that an error message is displayed indicating the email is required
        onView(withId(R.id.error_message)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}