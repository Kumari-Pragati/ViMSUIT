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

import java.util.List;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_12804_12804005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityTestScreenReaderInteraction() throws InterruptedException {
        // Loop through all elements and perform tests
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    // Test withId(R.id.id_recyclerview)
                    onView(withId(R.id.id_recyclerview))
                            .perform(click());
                    Thread.sleep(500);
                    Espresso.pressBack();
                    break;
                case 2:
                    // Test withId(R.id.id_popup_menu)
                    onView(withId(R.id.id_popup_menu))
                            .perform(click());
                    Thread.sleep(500);
                    Espresso.pressBack();
                    break;
                case 3:
                    // Test withContentDescription("['Navigate up']")
                    AccessibilityNodeInfo node = Espresso.accessibility().getRootInActiveWindow();
                    List<AccessibilityNodeInfo> nodes = node.findAccessibilityNodeInfosByViewId("");
                    for (AccessibilityNodeInfo nodeInfo : nodes) {
                        if ("Navigate up".equals(nodeInfo.getContentDescription())) {
                            nodeInfo.performAction(AccessibilityNodeInfo.ACTION_CLICK);
                            Thread.sleep(500);
                            Espresso.pressBack();
                            break;
                        }
                    }
                    break;
                case 4:
                    // Test withContentDescription("['More options']")
                    nodes = node.findAccessibilityNodeInfosByViewId("");
                    for (AccessibilityNodeInfo nodeInfo : nodes) {
                        if ("More options".equals(nodeInfo.getContentDescription())) {
                            nodeInfo.performAction(AccessibilityNodeInfo.ACTION_CLICK);
                            Thread.sleep(500);
                            Espresso.pressBack();
                            break;
                        }
                    }
                    break;
            }
        }

        // Verify state of elements
        onView(withId(R.id.id_recyclerview))
                .check(matches(isClickable()));
        onView(withContentDescription("['Navigate up']"))
                .check(matches(isClickable()));
        onView(withContentDescription("['More options']"))
                .check(matches(isClickable()));
    }
}