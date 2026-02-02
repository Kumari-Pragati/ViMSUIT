package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11039_11039005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnAGangImageToViewDetails() throws InterruptedException {
        // Step 1: Click on the gang image in the Gangs Section.
        Thread.sleep(500);
        onView(withId(R.id.id_ad_image)).perform(ViewActions.click());

        // Expected Result: The user should be redirected to the gang details screen.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.gang_details_screen_id)).check(matches(isDisplayed()));
    }
}