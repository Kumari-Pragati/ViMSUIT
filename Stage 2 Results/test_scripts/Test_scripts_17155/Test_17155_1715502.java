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
public class Test_17155_1715502 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyEnableRecentSearchesToggleSwitchFunctionality() throws InterruptedException {
        // Navigate to the Settings screen (assuming it's a separate activity or fragment)
        // For simplicity, we'll assume there is an intent to start the settings activity
        // Intent intent = new Intent(activityRule.getActivity(), SettingsActivity.class);
        // activityRule.getActivity().startActivity(intent);

        // Tap on the 'Enable Recent Searches' toggle switch (assuming it's withId(R.id.enableRecentSearchesToggle))
        onView(withId(R.id.enableRecentSearchesToggle)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update

        // Verify that the toggle switch changes its state
        onView(withId(R.id.enableRecentSearchesToggle)).check(matches(isChecked()));

        Thread.sleep(500); // Wait for UI to update

        // Tap on the 'Enable Recent Searches' toggle switch again to revert to the original state
        onView(withId(R.id.enableRecentSearchesToggle)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update

        // Verify that the toggle switch reverts to its original state
        onView(withId(R.id.enableRecentSearchesToggle)).check(matches(isNotChecked()));
    }
}