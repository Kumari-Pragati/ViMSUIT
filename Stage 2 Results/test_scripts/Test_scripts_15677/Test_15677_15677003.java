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
public class Test_15677_15677003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnAQuestionToCollapse() throws InterruptedException {
        // Step 1: Open the app and navigate to the Help & Contact screen.
        Espresso.onView(withId(R.id.id_lv_help_sub)).perform(ViewActions.click());

        // Step 2: Click on the chevron icon next to the question 'Who are we?'.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_lv_help_sub)).perform(ViewActions.click());

        // Step 3: Click on the chevron icon next to the question 'Who are we?'.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_lv_help_sub)).perform(ViewActions.click());

        // Step 4: Verify that the answer to the question 'Who are we?' is collapsed.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_lv_help_sub)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}