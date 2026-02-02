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
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.is;

@RunWith(AndroidJUnit4.class)
public class Test_12952_12952003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testBoundaryvalidationInvalidInput() throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        Thread.sleep(500);

        // Step 2: Click on the 'Receive Bitcoin' section.
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Step 3: Click on the 'Receive' button.
        onView(withId(R.id.receive_button)).perform(click());
        Thread.sleep(500);

        // Step 4: Enter an invalid wallet address in the input field.
        onView(withId(R.id.wallet_address_input_field)).perform(ViewActions.typeText("invalidaddress123"));
        Thread.sleep(500);

        // Expected Result: An error message is displayed indicating that the wallet address is invalid.
        onView(withContentDescription("[None]")).check(matches(ViewMatchers.withText(is("Invalid wallet address"))));
    }
}