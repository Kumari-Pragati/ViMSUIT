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
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isFocusable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_13648_1364805 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityScreenReaderInteraction() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Similar Courses' screen.
        onView(withId(R.id.id_recycler_view)).perform(click());
        Thread.sleep(500); // Wait for the view to be interacted with

        // Step 2: Use a screen reader to interact with the 'C#' course tile.
        Espresso.pressBack(); // Go back to main activity
        Thread.sleep(500);
        onView(withId(R.id.id_recycler_view)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Verify that the screen reader provides the correct information about the 'C#' course tile.
        Espresso.pressBack(); // Go back to main activity
        Thread.sleep(500);
        onView(withId(R.id.id_recycler_view)).perform(ViewActions.click());
        Thread.sleep(500);

        AccessibilityNodeInfo nodeInfo = getAccessibilityNodeInfoForCourse("C#");
        if (nodeInfo != null) {
            String courseTitle = nodeInfo.getText().toString();
            assert courseTitle.contains("C#") : "Screen reader did not provide the correct information about the 'C#' course tile.";
        } else {
            throw new AssertionError("AccessibilityNodeInfo for 'C#' course tile is null.");
        }
    }

    private AccessibilityNodeInfo getAccessibilityNodeInfoForCourse(String courseName) {
        Espresso.pressBack(); // Go back to main activity
        Thread.sleep(500);
        onView(withId(R.id.id_recycler_view)).perform(ViewActions.click());
        Thread.sleep(500);

        AccessibilityNodeInfo nodeInfo = Espresso.accessibilityManager.getAccessibilityNodeProviderForRoot().getRoot();
        if (nodeInfo != null) {
            for (int i = 0; i < nodeInfo.getChildCount(); i++) {
                AccessibilityNodeInfo childNodeInfo = nodeInfo.getChild(i);
                if (childNodeInfo.getText() != null && childNodeInfo.getText().toString().contains(courseName)) {
                    return childNodeInfo;
                }
            }
        }
        return null;
    }
}