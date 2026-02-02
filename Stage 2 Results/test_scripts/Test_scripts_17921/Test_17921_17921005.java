package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.accessibility.AccessibilityNodeInfo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17921_17921005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatAllMenuOptionsAreAccessible() throws InterruptedException {
        // Open the app and navigate to the menu screen.
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500);
        
        // Verify state of each element
        verifyElement(withId(R.id.id_drawer_layout));
        verifyElement(withContentDescription("['Close navigation drawer']"));
        verifyElement(withId(R.id.id_mInfo));
        verifyElement(withId(R.id.id_mDodaj));
        verifyElement(withId(R.id.id_design_navigation_view));
        for (int i = 0; i < 15; i++) {
            verifyElement(withContentDescription("[None]"));
        }
    }

    private void verifyElement(AccessibilityNodeInfo node) throws InterruptedException {
        Thread.sleep(500);
        onView(node).check(matches(isClickable()));
    }
}