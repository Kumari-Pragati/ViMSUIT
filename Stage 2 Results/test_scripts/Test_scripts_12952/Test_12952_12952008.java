package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12952_12952008 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDataPersistenceTestTransactionPersistence() throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        onView(withContentDescription("[None]")).perform(click());

        // Step 2: Click on the 'Receive Bitcoin' section.
        Thread.sleep(500);
        onView(withId(R.id.receive_bitcoin_section)).perform(click());

        // Step 3: Click on the 'Receive' button.
        Thread.sleep(500);
        onView(withText("Receive")).perform(click());

        // Step 4: Wait for the onboarding process to complete.
        Thread.sleep(500);

        // Step 5: Exit the app and relaunch it.
        activityTestRule.finishActivity();
        activityTestRule.launchActivity(null);

        // Step 6: Verify that the user is on the second step of the onboarding process.
        Thread.sleep(500);
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}