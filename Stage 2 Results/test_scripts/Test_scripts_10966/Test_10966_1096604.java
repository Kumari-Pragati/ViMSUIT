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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_10966_1096604 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTheEyeHealthAwarenessQuizzesSection() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'About' page.
        onView(withContentDescription("Navigate up")).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Step 2: Verify that the 'Eye Health Awareness Quizzes' section is present.
        onView(allOf(withId(R.id.eye_health_quizzes_section), isDisplayed())).check(matches(isDisplayed()));
    }
}