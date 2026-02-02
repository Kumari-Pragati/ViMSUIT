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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_14310_1431002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(5000); // 5 seconds

    @Test
    public void testNegativeFlowClickingOnNonexistentOptions() throws InterruptedException {
        // Open the app and navigate to the 'Easy Attendance Settings' screen.
        onView(withText("Settings")).perform(click());
        Thread.sleep(500);

        // Click on the 'Edit Classes' option.
        onView(withId(R.id.id_listview)).perform(ViewActions.scrollTo(), click());
        Thread.sleep(500);
        Espresso.onView(withText("Edit Classes")).check(matches(isDisplayed()));

        // Click on the 'Delete Classes' option.
        onView(withId(R.id.id_listview)).perform(ViewActions.scrollTo(), click());
        Thread.sleep(500);
        Espresso.onView(withText("Delete Classes")).check(matches(isDisplayed()));

        // Click on the 'Upgrade to PRO version' option.
        onView(withId(R.id.id_listview)).perform(ViewActions.scrollTo(), click());
        Thread.sleep(500);
        Espresso.onView(withText("Upgrade to PRO version")).check(matches(isDisplayed()));

        // Click on the 'Easy Attendance Help' option.
        onView(withId(R.id.id_listview)).perform(ViewActions.scrollTo(), click());
        Thread.sleep(500);
        Espresso.onView(withText("Easy Attendance Help")).check(matches(isDisplayed()));

        // Click on the 'About Easy Attendance' option.
        onView(withId(R.id.id_listview)).perform(ViewActions.scrollTo(), click());
        Thread.sleep(500);
        Espresso.onView(withText("About Easy Attendance")).check(matches(isDisplayed()));

        // Click on the 'Rate Us' option.
        onView(withId(R.id.id_listview)).perform(ViewActions.scrollTo(), click());
        Thread.sleep(500);
        Espresso.onView(withText("Rate Us")).check(matches(isDisplayed()));
    }
}