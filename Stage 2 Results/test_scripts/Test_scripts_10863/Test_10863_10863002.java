package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_10863_10863002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserSelectsTheNoThanksButtonInTheRatingPrompt() throws InterruptedException {
        // Step 1: Open the healthcare-related mobile application.
        // Step 2: Navigate to the home page. (Assuming this is done by default when MainActivity starts)

        // Step 3: Click on the 'No thanks' button in the rating prompt.
        Thread.sleep(500); // Wait for any initial loading or setup
        onView(withId(R.id.id_btnNegative)).perform(click());

        // Expected Result: The rating prompt is dismissed, and the user remains on the home page.
        Thread.sleep(500); // Additional wait to ensure the UI updates

        // Assert that the 'No thanks' button is no longer displayed (indicating the prompt was dismissed)
        onView(withId(R.id.id_btnNegative)).check(ViewAssertions.doesNotExist());

        // Optionally, assert that we are still on the home page
        Espresso.onView(withId(R.id.home_page_element_id)).check(ViewAssertions.matches(isDisplayed()));
    }
}