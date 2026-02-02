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

@RunWith(AndroidJUnit4.class)
public class Test_10352_10352007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheRefreshIconInTheHeader() throws InterruptedException {
        // Step 1: Click on the 'Refresh' icon in the header.
        Thread.sleep(500);
        onView(withId(R.id.id_menu_load)).perform(ViewActions.click());

        // Step 2: Verify that the content is refreshed.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.isRoot()).check(ViewAssertions.matches(isDisplayed()));
    }
}