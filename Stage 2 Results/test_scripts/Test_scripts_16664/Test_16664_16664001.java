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
public class Test_16664_16664001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndNavigateToTheCheckoutScreen() throws InterruptedException {
        // Verify the app name 'Checkout 51' is displayed in the header.
        onView(withText("Checkout 51"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Click on the 'All Categories' option in the navigation bar.
        onView(withId(R.id.id_ab_left))
            .perform(ViewActions.click());
        Thread.sleep(500);

        // Test each element
        for (int i = 1; i <= 6; i++) {
            onView(withId(R.id.id_icon))
                .perform(click());
            Thread.sleep(500);
            // Verify state
            Espresso.onView(withText("Checkout 51"))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }

        onView(withId(R.id.id_btn_upload))
            .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_ab_right))
            .perform(ViewActions.click());
        Thread.sleep(500);

        // Test withContentDescription("[None]")
        Espresso.onView(withContentDescription("[None]"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}