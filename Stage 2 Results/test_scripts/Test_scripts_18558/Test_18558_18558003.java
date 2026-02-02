package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_18558_18558003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationUserSelectsBothGenders() throws InterruptedException {
        // Step 1: Click on the 'I am male' toggle button.
        onView(withId(R.id.id_button1)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click on the 'I am female' toggle button.
        onView(withId(R.id.id_button1)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected result: An error message or prompt is displayed, indicating that only one gender can be selected.
        Espresso.onView(withText("Please select only one gender")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}