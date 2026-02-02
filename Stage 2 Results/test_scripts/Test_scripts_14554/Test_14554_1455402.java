package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_14554_1455402 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheSendAFriendAMessageNowTextIsPresent() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 1: Open the messaging app 'airMail'
        // Step 2: Verify the text 'Send a friend a message now!' is present

        // Select the FloatingActionButton and check if it is displayed
        onView(withId(R.id.id_airmail_fab_new)).check(matches(isDisplayed()));

        // Thread.sleep(500) to ensure the UI is fully loaded before asserting the text
        Thread.sleep(500);

        // Verify the text 'Send a friend a message now!' is present
        Espresso.onView(ViewMatchers.withText("Send a friend a message now!"))
                .check(matches(isDisplayed()));
    }
}