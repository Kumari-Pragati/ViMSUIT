package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_12954_1295404 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheDefaultWallet() throws InterruptedException {
        // Test each element
        onView(withContentDescription("['Navigate up']"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withText("My Bitcoin Wallet")).check(matches(withText("My Bitcoin Wallet")));

        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withText("My Bitcoin Wallet")).check(matches(withText("My Bitcoin Wallet")));

        // Assuming the third element is also a button or view that navigates to the same screen
        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withText("My Bitcoin Wallet")).check(matches(withText("My Bitcoin Wallet")));
    }
}