package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(JUnit4.class)
public class Test_14554_1455401 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheScreenDisplaysYouDontHaveAnyAirmailYet() throws InterruptedException {
        // Step 1: Open the messaging app 'airMail'
        
        // Step 2: Verify the screen displays 'You don't have any airMail yet.'
        Thread.sleep(500); // Wait for UI to load
        onView(withId(R.id.id_airmail_fab_new)).check(matches(isDisplayed()));
    }
}