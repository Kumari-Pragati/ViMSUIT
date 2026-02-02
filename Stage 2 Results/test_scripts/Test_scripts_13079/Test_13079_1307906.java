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
public class Test_13079_1307906 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateBackToThePreviousScreen() throws InterruptedException {
        // Wait for the view to be displayed before interacting with it
        onView(withId(R.id.id_button_popup)).check(ViewAssertions.matches(isDisplayed()));

        // Simulate a delay (500ms) between interactions
        Thread.sleep(500);

        // Click on the button
        Espresso.onView(withId(R.id.id_button_popup)).perform(click());

        // Wait for the view to be displayed before asserting
        onView(withId(R.id.id_previous_screen_element_id)).check(ViewAssertions.matches(isDisplayed()));

        // Simulate a delay (500ms) between interactions
        Thread.sleep(500);
    }
}