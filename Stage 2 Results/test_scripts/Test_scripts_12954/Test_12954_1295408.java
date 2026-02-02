package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_12954_1295408 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTestDataPersistence() throws InterruptedException {
        // Loop through all elements and perform the test steps on each

        // Element 1: withContentDescription("['Navigate up']")
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);
        
        // Verify state
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 2: withContentDescription("[None]") - piuk.blockchain.android:id/accountsList
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        
        // Verify state
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 3: withContentDescription("[None]")
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        
        // Verify state
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}