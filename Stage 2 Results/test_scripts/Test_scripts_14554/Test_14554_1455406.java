package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;

public class Test_14554_1455406 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistenceWhenTheAppIsClosedAndReopened throws InterruptedException {
        // Step 1: Open the messaging app 'airMail'
        onView(withId(R.id.id_airmail_list)).check(matches(withText("You don't have any airMail yet.")));

        // Step 2: Close the app
        Thread.sleep(500);

        // Step 3: Reopen the messaging app 'airMail'
        activityTestRule.launchActivity(null);

        // Step 4: Verify the screen still displays 'You don't have any airMail yet.'
        onView(withId(R.id.id_airmail_list)).check(matches(withText("You don't have any airMail yet.")));
    }
}