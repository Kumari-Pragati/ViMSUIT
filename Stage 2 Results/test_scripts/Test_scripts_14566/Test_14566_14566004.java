package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14566_14566004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowAttemptingToInteractWithNonexistentListOptions() throws InterruptedException {
        // Open the CW Seed app.
        Espresso.onView(withId(R.id.info_tab)).perform(ViewActions.click());

        // Tap on the 'INFO' tab.
        Thread.sleep(500); // Wait for UI to update

        // Attempt to tap on a non-existent list option.
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for potential UI interactions

        // The app should not display a non-existent list option.
        Espresso.onView(withId(R.id.list)).check(doesNotExist());

        TestName testName = (TestName) getAnnotation(TestName.class);
        String testMethodName = testName.getMethodName();
        System.out.println(String.format("Test %s finished", testMethodName));
    }
}