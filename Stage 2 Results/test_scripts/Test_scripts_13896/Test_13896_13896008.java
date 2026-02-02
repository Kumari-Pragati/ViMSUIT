package com.example.tests;

import android.view.KeyEvent;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_13896_13896008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckUsabilityOfTheScreen() throws InterruptedException {
        // Wait for the GridView to be clickable and focusable
        Thread.sleep(500);
        
        // Step 1: Attempt to navigate through the screen using only the keyboard.
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.keyEvent(KeyEvent.KEYCODE_DPAD_LEFT));
        Thread.sleep(500);
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.keyEvent(KeyEvent.KEYCODE_DPAD_RIGHT));
        Thread.sleep(500);
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.keyEvent(KeyEvent.KEYCODE_DPAD_UP));
        Thread.sleep(500);
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.keyEvent(KeyEvent.KEYCODE_DPAD_DOWN));
        
        // Expected Result: The screen should be usable with a keyboard.
        Espresso.onView(withContentDescription("[None]")).check(ViewAssertions.matches(ViewMatchers.isClickable()));
        Espresso.onView(withContentDescription("[None]")).check(ViewAssertions.matches(ViewMatchers.isFocusable()));
    }
}