package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.app.FragmentTabHost;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_12393_1239305 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigateBetweenTabs() throws InterruptedException {
        // Step 1: Open the application (Assumed to be done by the ActivityTestRule)

        // Step 2: Tap on the 'MY TASK LIST' tab.
        onView(withId(R.id.id_tasks_tabs)).perform(click());
        Thread.sleep(500);

        // Step 3: Tap on the 'ASSIGNED BY ME' tab.
        onView(withText("Assigned By Me")).inRoot(FragmentTabHost.resolvedFragmentRoot()).perform(click());
        Thread.sleep(500);

        // Step 4: Tap on the 'MY TASK LIST' tab again.
        onView(withId(R.id.id_tasks_tabs)).perform(click());
        Thread.sleep(500);

        // Expected Result: The application navigates between the 'MY TASK LIST' and 'ASSIGNED BY ME' tabs.
        // Assertion for 'MY TASK LIST' tab
        onView(withText("My Task List")).inRoot(FragmentTabHost.resolvedFragmentRoot()).check(matches(withText("My Task List")));
    }
}