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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15668_1566801 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheAbsenceOfVouchersMessage() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'My Vouchers' section.
        onView(withId(R.id.id_vouchers_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Verify that the message 'You don't have any vouchers.' is displayed.
        onView(withText("You don't have any vouchers.")).check(ViewAssertions.matches(withId(R.id.id_vouchers_button)));
    }
}