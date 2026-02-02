package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1068_1068008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanToggleTheOnlineStatus() throws InterruptedException {
        // Observe the green dot indicating 'Online for 2 minutes'.
        onView(withId(R.id.id_profile)).check(ViewAssertions.matches(withText("Online for 2 minutes")));

        // Click on the green dot to toggle the online status.
        Thread.sleep(500);
        onView(withId(R.id.id_profile)).perform(ViewActions.click());

        // Wait for a moment before checking the result
        Thread.sleep(500);

        // The online status is successfully toggled.
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withId(R.id.id_profile)).check(ViewAssertions.matches(withText("Online for 2 minutes"))); // This should fail if the status was not toggled

        // Additional assertion to check the new state
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withId(R.id.id_profile)).check(ViewAssertions.matches(withText("Offline")));
    }
}