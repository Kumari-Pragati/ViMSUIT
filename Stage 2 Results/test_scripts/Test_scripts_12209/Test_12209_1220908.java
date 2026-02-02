package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_12209_1220908 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheContestsSectionAndVerifyTheContent() throws InterruptedException {
        // Step 1: Click on the 'CONTESTS' section
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Verify the content of the 'CONTESTS' section
        Espresso.onView(withText("CONTESTS"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500); // Wait for UI to stabilize before assertions

        // Additional verification can be added here if needed
    }
}