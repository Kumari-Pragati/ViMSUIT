package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;

@RunWith(AndroidJUnit4.class)
public class Test_14952_1495205 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUiTestAgeSelectionGridVisibility() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 1: Open the app and navigate to the onboarding screen (Assuming onboarding screen is MainActivity)
        
        // Step 2: Verify that the age selection grid is visible and accessible
        onView(withId(R.id.id_gender_age_selection_male_grid)).check(matches(isDisplayed()));
        onView(withId(R.id.id_gender_age_selection_male_grid)).check(matches(isEnabled()));

        // Additional assertion to ensure it's clickable (optional, but recommended for thorough testing)
        Espresso.onView(ViewMatchers.withId(R.id.id_gender_age_selection_male_grid))
                .perform(ViewActions.click())
                .check(matches(isDisplayed()));
    }
}