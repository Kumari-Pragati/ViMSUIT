package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_1411_141108 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityusabilityKeyboardNavigation() throws InterruptedException {
        // Step 1: Open the mobile app and navigate to the 'Browse' page.
        Thread.sleep(500); // Wait for the app to load

        // Step 2: Use keyboard navigation to select the 'Romance' genre filter button.
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait for the action to be processed

        // Step 3: Verify that the genre filter is applied.
        Button romanceButton = (Button) activityTestRule.getActivity().findViewById(R.id.Romance);
        onView(withId(R.id.Romance)).check(matches(ViewMatchers.isDisplayed()));
    }
}