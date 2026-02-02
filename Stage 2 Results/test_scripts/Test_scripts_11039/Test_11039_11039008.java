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
public class Test_11039_11039008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheAdvertisementSectionToViewDetails() throws InterruptedException {
        // Step 1: Click on the advertisement section in the Advertisement Section.
        Thread.sleep(500);
        onView(withId(R.id.id_ad_action_button)).perform(ViewActions.click());

        // Expected Result: The user should be redirected to the advertisement details screen.
        Thread.sleep(500);
        Espresso.onView(hasDesc("Advertisement Details Screen Title")).check(matches(isDisplayed()));
    }
}