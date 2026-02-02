package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_14566_14566005 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowVerifyingAppVersion throws InterruptedException {
        // Step 1: Open the CW Seed app (Assuming it's already open, or this step is handled by setup)

        // Step 2: Tap on the 'INFO' tab
        onView(ViewMatchers.withId(R.id.tabLayout)).performScrollTo();
        Thread.sleep(500); // Wait for 500ms to ensure the view is fully loaded

        // Step 3: Verify that the app version (v1.1.260) is displayed
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms after clicking

        TextView versionTextView = activityTestRule.getActivity().findViewById(R.id.appVersionTextView);
        onView(withId(versionTextView.getId())).check(matches(withText("v1.1.260")));

        // Additional assertion to ensure the correct text is displayed
        Espresso.onView(ViewMatchers.withId(R.id.appVersionTextView)).check(matches(withText("v1.1.260")));
    }
}