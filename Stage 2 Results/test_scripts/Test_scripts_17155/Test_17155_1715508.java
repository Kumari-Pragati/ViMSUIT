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

@RunWith(AndroidJUnit4.class)
public class Test_17155_1715508 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testVerifyTurnOnPushNotificationsForSavedSearchAlertsToggleSwitchDefaultState() throws InterruptedException {
        // Navigate to the Settings screen
        onView(withId(R.id.nav_view)).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify that the 'Turn on push notifications for saved search alerts' toggle switch is in its default state
        onView(withContentDescription("[None]")).check(matches(ViewMatchers.isChecked()));
        Thread.sleep(500);
    }
}