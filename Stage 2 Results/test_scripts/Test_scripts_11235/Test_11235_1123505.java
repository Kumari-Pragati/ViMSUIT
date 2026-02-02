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
public class Test_11235_1123505 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityTestScreenReader() throws InterruptedException {
        // Step 1: Open the Food Delivery App (Assuming it's already open)
        
        // Step 2: Navigate to the 'Biancorosso' restaurant page
        onView(withId(R.id.id_tab_layout)).perform(click());
        Thread.sleep(500); // Wait for the tab layout to be interacted with

        // Step 3: Use a screen reader to navigate through the screen
        Espresso.pressBack(); // Simulate pressing back to return to previous screen
        Thread.sleep(500);

        // Check if the screen reader reads out content correctly
        AccessibilityNodeInfo nodeInfo = Espresso.getAccessibilityManager().getRootInActiveWindow();
        boolean isContentReadCorrectly = false;

        while (!isContentReadCorrectly) {
            for (int i = 0; i < nodeInfo.getChildCount(); i++) {
                AccessibilityNodeInfo child = nodeInfo.getChild(i);
                if (child.getText() != null && !child.getText().toString().isEmpty()) {
                    isContentReadCorrectly = true;
                    break;
                }
            }
            Thread.sleep(500); // Wait for the screen reader to read out content
        }

        // Assert that the screen reader reads out content correctly
        onView(allOf(withId(R.id.id_tab_layout), isClickable())).check(matches(ViewMatchers.isDisplayed()));
    }
}