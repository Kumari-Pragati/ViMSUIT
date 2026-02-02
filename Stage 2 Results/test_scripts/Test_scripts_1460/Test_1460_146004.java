package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1460_146004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowClickCancelWithoutAddingAPerson throws InterruptedException {
        // Navigate to the People screen (assuming it's the initial screen)
        Thread.sleep(500); // Wait for 500ms

        // Click on the 'Finish' button without adding a person
        onView(withId(R.id.id_finish)).perform(click());
        Thread.sleep(500); // Wait for 500ms

        // Assert that the app returns to the previous screen
        onView(withText("People")).check(matches(isDisplayed()));
    }
}