package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_12188_12188008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowUserClicksMaybeLaterButtonAndThenLetsGoButton throws InterruptedException {
        // Step 1: Open the application (Assumed to be done by ActivityTestRule)

        // Step 2: Navigate to the onboarding screen
        onView(withId(R.id.id_fragment_onboarding_introduction_next_button)).perform(click());
        Thread.sleep(500);

        // Step 3: Click on the 'Maybe Later' button
        onView(ViewMatchers.withText("Maybe Later")).perform(click());
        Thread.sleep(500);

        // Step 4: Click on the 'Let's Go!' button
        onView(withId(R.id.id_fragment_onboarding_introduction_next_button)).perform(click());
        Thread.sleep(500);

        // Expected Result: The application should remain on the onboarding screen.
        // The 'Maybe Later' button should be disabled after the first click.
        onView(ViewMatchers.withText("Maybe Later")).check(matches(not(isEnabled())));

        // Additional assertion to check if the 'Let's Go!' button is still enabled
        onView(withId(R.id.id_fragment_onboarding_introduction_next_button)).check(matches(isEnabled()));
    }
}