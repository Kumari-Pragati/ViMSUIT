package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17620_1762005 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistence throws InterruptedException {
        // Step 1: Open the NextRadio app.
        
        // Step 2: Navigate to the screen displaying the informational message about FM radio unavailability.
        onView(withId(R.id.id_txtNoRadioLink)).check(matches(isDisplayed()));

        // Step 3: Close the app and reopen it.
        activityTestRule.finishActivity();
        Thread.sleep(500); // Wait for 500ms to ensure the app is closed
        activityTestRule.launchActivity(null);

        // Step 4: Verify that the informational message is still displayed.
        onView(withId(R.id.id_txtNoRadioLink)).check(matches(isDisplayed()));
    }
}