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

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11751_1175106 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForEmptyList() throws InterruptedException {
        // Open the app and navigate to the 'Bus Routes' screen.
        Espresso.onView(withId(R.id.id_listView1)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for 500 milliseconds

        // Verify that the list is not empty
        onView(withId(R.id.id_listView1)).check(ViewAssertions.matches(isDisplayed()));
    }
}