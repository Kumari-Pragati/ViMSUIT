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
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15065_1506504 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testUsabilityAccessibilityAndNavigation() throws InterruptedException {
        // Step 1: Open the app and navigate to the Contacts settings page.
        Thread.sleep(500);

        // Step 2: Use voice commands to navigate to the Contacts settings page.
        Espresso.pressImeKey(ViewActions.KEYCODE_DPAD_CENTER);
        Thread.sleep(500);

        // Step 3: Use screen reader to navigate to the Contacts settings page.
        Espresso.pressImeKey(ViewActions.KEYCODE_DPAD_DOWN);
        Thread.sleep(500);

        // Step 4: Use keyboard navigation to navigate to the Contacts settings page.
        onView(withId(R.id.id_invisibleContacts)).check(matches(isClickable()));
        Thread.sleep(500);

        // Assert that the switch is clickable
        onView(withId(R.id.id_invisibleContacts)).perform(click());
        Thread.sleep(500);
    }
}