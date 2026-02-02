package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_15677_15677001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyHelpContactScreenDisplay() throws InterruptedException {
        // Step 1: Open the app and navigate to the Help & Contact screen.
        onView(withText("Help & Contact")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Verify that the header displays the title 'Help & Contact'.
        onView(ViewMatchers.withId(R.id.id_header_title)).check(matches(withText("Help & Contact")));
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Check that the list of questions is displayed correctly.
        onView(withId(R.id.id_lv_help_sub)).check(matches(isDisplayed()));
        Thread.sleep(500); // Wait for UI to update
    }
}