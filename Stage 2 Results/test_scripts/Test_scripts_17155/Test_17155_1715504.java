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
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17155_1715504 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTurnOnPushNotificationsForMessageBoxToggleSwitchFunctionality() throws InterruptedException {
        // Navigate to the Settings screen (assuming it's already in settings)
        
        // Tap on the 'Turn on push notifications for message box' toggle switch.
        onView(withId(R.id.id_pushNotificationsToggle)).perform(click());
        Thread.sleep(500); // Wait for UI update
        
        // Verify that the toggle switch changes its state.
        if (Espresso.getMainApplication().getSharedPreferences("Settings", 0).getBoolean("push_notifications_enabled", false)) {
            onView(withId(R.id.id_pushNotificationsToggle)).check(matches(isChecked()));
        } else {
            onView(withId(R.id.id_pushNotificationsToggle)).check(matches(isNotChecked()));
        }
        
        // Tap on the 'Turn on push notifications for message box' toggle switch again to revert to the original state.
        Thread.sleep(500); // Wait for UI update
        onView(withId(R.id.id_pushNotificationsToggle)).perform(click());
        Thread.sleep(500); // Wait for UI update
        
        // Verify that the toggle switch reverts to its original state.
        if (Espresso.getMainApplication().getSharedPreferences("Settings", 0).getBoolean("push_notifications_enabled", false)) {
            onView(withId(R.id.id_pushNotificationsToggle)).check(matches(isChecked()));
        } else {
            onView(withId(R.id.id_pushNotificationsToggle)).check(matches(isNotChecked()));
        }
    }
}