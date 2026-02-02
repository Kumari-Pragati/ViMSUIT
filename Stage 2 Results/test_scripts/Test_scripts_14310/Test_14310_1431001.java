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
public class Test_14310_1431001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigatingThroughSettingsOptions() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Easy Attendance Settings' screen.
        onView(withId(R.id.id_listview)).perform(ViewActions.click());

        // Step 2: Click on the 'Edit Classes' option.
        Thread.sleep(500);
        Espresso.onView(withText("Edit Classes")).check(ViewAssertions.matches(isDisplayed()));

        // Step 3: Click on the 'Delete Classes' option.
        Thread.sleep(500);
        Espresso.onView(withText("Delete Classes")).perform(ViewActions.click());

        // Step 4: Click on the 'Upgrade to PRO version' option.
        Thread.sleep(500);
        Espresso.onView(withText("Upgrade to PRO version")).check(ViewAssertions.matches(isDisplayed()));

        // Step 5: Click on the 'Easy Attendance Help' option.
        Thread.sleep(500);
        Espresso.onView(withText("Easy Attendance Help")).perform(ViewActions.click());

        // Step 6: Click on the 'About Easy Attendance' option.
        Thread.sleep(500);
        Espresso.onView(withText("About Easy Attendance")).check(ViewAssertions.matches(isDisplayed()));

        // Step 7: Click on the 'Rate Us' option.
        Thread.sleep(500);
        Espresso.onView(withText("Rate Us")).perform(ViewActions.click());
    }
}