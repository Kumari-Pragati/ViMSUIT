package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_18558_18558002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserAttemptsToProceedWithoutSelectingGender() throws InterruptedException {
        // Click on the progress indicator without selecting a gender.
        onView(withId(R.id.id_button1)).perform(click());
        Thread.sleep(500); // Wait for 500ms to ensure UI updates

        // Assert that an error message or prompt is displayed, indicating that a gender selection is required.
        onView(withText("Please select your gender")).check(ViewAssertions.matches(isDisplayed()));
    }
}