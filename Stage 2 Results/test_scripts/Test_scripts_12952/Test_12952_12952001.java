package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(JUnit4.class)
public class Test_12952_12952001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowCompleteOnboardingProcess() throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        onView(allOf(withId(R.id.pager_onboarding), withContentDescription("[None]"))).perform(ViewActions.click());

        // Step 2: Click on the 'Receive Bitcoin' section.
        Thread.sleep(500);
        onView(withText("Receive Bitcoin")).perform(click());

        // Step 3: Click on the 'Receive' button.
        Thread.sleep(500);
        onView(allOf(withId(R.id.receive_button), withContentDescription("[None]"))).perform(ViewActions.click());

        // Step 4: Wait for the onboarding process to complete.
        Thread.sleep(500);

        // Step 5: Verify that the user is on the second step of the onboarding process.
        Thread.sleep(500);
        onView(allOf(withId(R.id.pager_onboarding), withContentDescription("[None]"))).check(matches(withText("Step 2")));
    }
}