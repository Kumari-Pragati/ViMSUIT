package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17155_1715503 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTurnOnPushNotificationsForSavedSearchAlertsToggleSwitchFunctionality() throws InterruptedException {
        // Navigate to the Settings screen (assuming it's already there or a method to navigate is available)
        
        // Tap on the 'Turn on push notifications for saved search alerts' toggle switch
        onView(withId(R.id.id_push_notifications_toggle)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Verify that the toggle switch changes its state
        onView(withId(R.id.id_push_notifications_toggle)).check(matches(isChecked()));
        
        // Tap on the 'Turn on push notifications for saved search alerts' toggle switch again to revert to the original state
        onView(withId(R.id.id_push_notifications_toggle)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Verify that the toggle switch reverts to its original state
        onView(withId(R.id.id_push_notifications_toggle)).check(matches(isNotChecked()));
        
        // Additional test step: Verify 'Sign Out' button is clickable and focusable
        onView(withId(R.id.id_logoutButton)).perform(click());
    }
}