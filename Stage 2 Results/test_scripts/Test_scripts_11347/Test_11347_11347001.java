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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11347_11347001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testPositiveFlowCreateANewTeam() throws InterruptedException {
        // Open the app and navigate to the 'TEAMDEX' section.
        Thread.sleep(500); // Wait for the app to initialize

        // Click on the 'Create a Team' option in the main content area.
        onView(withId(R.id.id_team)).perform(click());
        Thread.sleep(500);

        // A new team creation form should appear with fields to input team details.
        onView(withId(R.id.id_team_creation_form)).check(matches(isDisplayed()));
    }
}