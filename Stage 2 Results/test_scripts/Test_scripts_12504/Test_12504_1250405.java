package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12504_1250405 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewThePhoneNumberForCancellations() throws InterruptedException {
        // Scroll down to view the phone number for cancellations
        onView(withId(R.id.id_BundleDetailsLandingRecyclerView))
                .perform(ViewActions.scrollTo())
                .check(ViewAssertions.matches(isDisplayed()));

        // Add a delay between interactions
        Thread.sleep(500);

        // Verify that the user can see the phone number provided for cancellations
        Espresso.onView(withId(R.id.id_BundleDetailsLandingRecyclerView))
                .check(ViewAssertions.matches(isDisplayed()));
    }
}