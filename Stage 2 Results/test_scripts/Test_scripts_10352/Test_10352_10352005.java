package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class Test_10352_10352005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectDrawAsThePrediction() throws InterruptedException {
        // Step 1: Click on the 'More options' selector
        onView(withContentDescription("['More options']")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Verify that 'Draw' is selected as the prediction
        // Assuming 'Draw' has a specific content description or text
        // For this example, we will use a placeholder content description
        onView(withContentDescription("['Draw']")).check(matches(isDisplayed()));
    }
}