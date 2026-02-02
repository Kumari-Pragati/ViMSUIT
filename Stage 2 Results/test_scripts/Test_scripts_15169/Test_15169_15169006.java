package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_15169_15169006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidMonthSelection() throws InterruptedException {
        // Open the app and navigate to the 'New User' screen (assuming it's already there)
        
        // Test each element
        for (int i = 0; i < 2; i++) {
            onView(withContentDescription("[None]")).perform(click());
            Thread.sleep(500);
            
            // Open date picker dialog to select a birthday
            Espresso.openActionBarOverflowOrOptionsMenu(activityRule.getActivity());
            Espresso.pressKey(ViewActions.keyEvent(ViewActions.KeyEvents.KEYCODE_DPAD_DOWN));
            Espresso.pressKey(ViewActions.keyEvent(ViewActions.KeyEvents.KEYCODE_DPAD_CENTER));
            Thread.sleep(500);
            
            // Select an invalid month from the month selection field
            onView(withContentDescription("[None]")).perform(ViewActions.click());
            Thread.sleep(500);
            Espresso.pressKey(ViewActions.keyEvent(ViewActions.KeyEvents.KEYCODE_1));
            Espresso.pressKey(ViewActions.keyEvent(ViewActions.KeyEvents.KEYCODE_DPAD_CENTER));
            Thread.sleep(500);
            
            // Select a day from the day selection field
            onView(withContentDescription("[None]")).perform(ViewActions.click());
            Thread.sleep(500);
            Espresso.pressKey(ViewActions.keyEvent(ViewActions.KeyEvents.KEYCODE_1));
            Espresso.pressKey(ViewActions.keyEvent(ViewActions.KeyEvents.KEYCODE_DPAD_CENTER));
            Thread.sleep(500);
            
            // Select a year from the year selection field
            onView(withContentDescription("[None]")).perform(ViewActions.click());
            Thread.sleep(500);
            Espresso.pressKey(ViewActions.keyEvent(ViewActions.KeyEvents.KEYCODE_1));
            Espresso.pressKey(ViewActions.keyEvent(ViewActions.KeyEvents.KEYCODE_DPAD_CENTER));
            Thread.sleep(500);
            
            // Tap on the 'OK' button to confirm the birthday selection
            onView(withContentDescription("[None]")).perform(ViewActions.click());
            Thread.sleep(500);
            
            // Verify error message for invalid month selection
            Espresso.onView(ViewMatchers.withText("Invalid month selected"))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }
    }
}