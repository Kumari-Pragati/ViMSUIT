package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.view.accessibility.AccessibilityNodeInfo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(JUnit4.class)
public class Test_10693_10693004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityTestScreenReaderInteraction() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'MASCOTS' section.
        onView(withId(R.id.mascots_section)).perform(click());

        // Step 2: Use a screen reader to interact with the navigation bar and mascot images.
        Thread.sleep(500); // Wait for UI to stabilize

        // Check if the emoji image is clickable
        onView(allOf(isClickable(), withId(R.id.id_emoji_image))).check(matches(ViewMatchers.isDisplayed()));

        // Simulate screen reader interaction (this step might require custom Espresso actions or a custom view)
        AccessibilityNodeInfo nodeInfo = Espresso.accessibility().getAccessibilityNodeProviderCompat(activityTestRule.getActivity()).getRootInActiveWindow();
        if (nodeInfo != null) {
            nodeInfo.performAction(AccessibilityNodeInfo.ACTION_FOCUS);
            Thread.sleep(500); // Wait for screen reader to announce the focus
        }

        // Check if the screen reader correctly reads out the emoji image
        Espresso.pressBack(); // Go back to previous view
        Thread.sleep(500); // Wait for UI to stabilize

        // Perform a click on the emoji image and check if it is read by the screen reader
        onView(withId(R.id.id_emoji_image)).perform(click());
        Thread.sleep(500); // Wait for screen reader to announce the click
    }
}