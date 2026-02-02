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
public class Test_13575_1357506 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityVerifyAccessibilityFeatures() throws InterruptedException {
        // Step 1: Open the app and navigate to the category selection screen

        // Step 2: Use voice commands to navigate to the category selection screen
        Espresso.pressKey(ViewActions.keyEvent(KeyEvent.KEYCODE_DPAD_CENTER));

        // Step 3: Use screen reader to navigate to the category selection screen
        AccessibilityNodeInfo root = Espresso.getAccessibilityManager().getRootInActiveWindow();
        List<AccessibilityNodeInfo> nodes = root.findAccessibilityNodeInfosByViewId("com.quikr:id/category_subcategory_list");
        if (!nodes.isEmpty()) {
            nodes.get(0).performAction(AccessibilityNodeInfo.ACTION_FOCUS);
        }

        // Step 4: Verify that all UI elements are accessible and can be interacted with

        // Element 1
        onView(withId(R.id.id_category_subcategory_list))
                .check(matches(isClickable()))
                .perform(click());
        Thread.sleep(500);

        // Element 2
        onView(withContentDescription("['Navigate up']"))
                .check(matches(isClickable()))
                .perform(click());
        Thread.sleep(500);
    }
}