package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;

@RunWith(AndroidJUnit4.class)
public class Test_15668_1566804 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000);

    @Test
    public void testCheckTheVoucherConditions() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'My Vouchers' section.
        onView(withId(R.id.id_vouchers_button)).perform(ViewActions.click());
        sleep(500); // Wait for UI to update

        // Step 2: Verify that the voucher conditions explaining the rules for using vouchers are displayed.
        onView(withText("Voucher Conditions")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        sleep(500); // Wait for UI to update
    }
}