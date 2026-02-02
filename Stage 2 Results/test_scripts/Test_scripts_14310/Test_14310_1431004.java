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
public class Test_14310_1431004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowClickingOnNonexistentOptions() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Easy Attendance Settings' screen.
        Espresso.onView(withId(R.id.id_listview)).perform(ViewActions.click());

        // Step 2: Click on the 'Edit Classes' option.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_listview)).perform(ViewActions.click());
        Espresso.onView(withText("Edit Classes")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 3: Click on the 'Delete Classes' option.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_listview)).perform(ViewActions.click());
        Espresso.onView(withText("Delete Classes")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 4: Click on the 'Upgrade to PRO version' option.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_listview)).perform(ViewActions.click());
        Espresso.onView(withText("Upgrade to PRO version")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 5: Click on the 'Easy Attendance Help' option.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_listview)).perform(ViewActions.click());
        Espresso.onView(withText("Easy Attendance Help")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 6: Click on the 'About Easy Attendance' option.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_listview)).perform(ViewActions.click());
        Espresso.onView(withText("About Easy Attendance")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 7: Click on the 'Rate Us' option.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_listview)).perform(ViewActions.click());
        Espresso.onView(withText("Rate Us")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}