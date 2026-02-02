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
public class Test_14952_1495201 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSelectingAgeGroupAndProceeding() throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        // Assuming the onboarding screen is already displayed

        // Step 2: Select an age group in the 'Male' section.
        Espresso.onView(withId(R.id.male_age_group)).perform(ViewActions.click());

        // Step 3: Select an age group in the 'Female' section.
        Espresso.onView(withId(R.id.female_age_group)).perform(ViewActions.click());

        // Step 4: Click on the 'SKIP' button at the bottom.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_next_btn)).perform(ViewActions.click());

        // Expected Result: The app should proceed to the next onboarding screen.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_next_btn)).check(ViewAssertions.matches(ViewMatchers.isDisabled()));

        // Additional assertion for proceeding to the next screen
        Thread.sleep(500);
        Espresso.onView(withText("Next Screen Title")).check(matches(isDisplayed()));
    }
}