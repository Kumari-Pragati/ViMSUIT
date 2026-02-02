package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_12393_1239307 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowToggleBetweenTabs() throws InterruptedException {
        // Step 1: Open the application (Assumed to be done by ActivityTestRule)

        // Step 2: Tap on the 'MY TASK LIST' tab.
        onView(withId(R.id.id_tasks_tabs)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Tap on the 'ASSIGNED BY ME' tab.
        onView(withId(R.id.id_tasks_tabs)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 4: Tap on the 'MY TASK LIST' tab again.
        onView(withId(R.id.id_tasks_tabs)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: The application toggles between the 'MY TASK LIST' and 'ASSIGNED BY ME' tabs.

        // Assertion for MY TASK LIST tab
        onView(withId(R.id.id_tasks_tabs)).check(ViewAssertions.matches(isDisplayed()));

        // Assertion for ASSIGNED BY ME tab (Assuming there is a specific view or text that indicates this tab)
        // For example, if there's a TextView with id R.id.assigned_by_me_text:
        onView(withId(R.id.assigned_by_me_text)).check(ViewAssertions.matches(isDisplayed()));
    }
}