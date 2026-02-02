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
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class Test_12188_12188007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowUserClicksLetsGoButtonAndThenMaybeLaterButton throws InterruptedException {
        // Step 1: Open the application.
        // Step 2: Navigate to the onboarding screen. (Assuming it's already there)

        // Step 3: Click on the 'Let's Go!' button.
        onView(withId(R.id.id_fragment_onboarding_introduction_next_button)).perform(click());
        Thread.sleep(500);

        // Step 4: Click on the 'Maybe Later' button.
        onView(withId(R.id.id_fragment_onboarding_introduction_maybe_later_button)).perform(click());
        Thread.sleep(500);

        // Expected Result:
        // The application should remain on the onboarding screen.
        // The 'Let's Go!' button should be disabled after being clicked.

        // Assert that the 'Let's Go!' button is not clickable
        onView(withId(R.id.id_fragment_onboarding_introduction_next_button)).check(matches(not(isClickable())));

        // Assert that we are still on the onboarding screen
        onView(withId(R.id.id_fragment_onboarding_introduction_container)).check(matches(isDisplayed()));
    }
}