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
public class Test_17155_1715501 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyWarnMeBeforeExitingToggleSwitchFunctionality() throws InterruptedException {
        // Navigate to the Settings screen (assuming it's already in settings)
        
        // Tap on the 'Warn me before exiting' toggle switch
        onView(withId(R.id.id_logoutButton)).perform(click());
        Thread.sleep(500); // Wait for 500ms
        
        // Verify that the toggle switch changes its state
        onView(withId(R.id.id_logoutButton)).check(matches(isChecked()));
        
        // Tap on the 'Warn me before exiting' toggle switch again to revert to the original state
        onView(withId(R.id.id_logoutButton)).perform(click());
        Thread.sleep(500); // Wait for 500ms
        
        // Verify that the toggle switch reverts to the original state
        onView(withId(R.id.id_logoutButton)).check(matches(isNotChecked()));
    }
}