package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Test_12188_12188001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowUserClicksLetsGoButton() throws InterruptedException {
        // Step 1: Open the application (Assumed to be done by ActivityTestRule)
        
        // Step 2: Navigate to the onboarding screen
        Espresso.onView(ViewMatchers.withId(R.id.id_fragment_onboarding_introduction_next_button)).check(
                ViewAssertions.matches(ViewMatchers.isDisplayed())
        );

        // Step 3: Click on the 'Let's Go!' button
        Espresso.onView(ViewMatchers.withId(R.id.id_fragment_onboarding_introduction_next_button))
                .perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The application should proceed to the next onboarding step.
        Espresso.onView(ViewMatchers.withId(R.id.id_fragment_onboarding_introduction_next_button)).check(
                ViewAssertions.matches(ViewMatchers.isNotClickable())
        );
    }
}