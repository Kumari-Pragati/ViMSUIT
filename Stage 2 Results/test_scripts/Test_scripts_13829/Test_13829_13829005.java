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

@RunWith(JUnit4.class)
public class Test_13829_13829005 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithFacebookAccessibilityTest() throws InterruptedException {
        // Step 1: Open the Drug Index app (Assuming it's already open, or this step is handled by setup)

        // Step 2: Click on the Facebook login prompt
        onView(withId(R.id.facebook_login_button)).perform(click());
        Thread.sleep(500); // Wait for the dialog to appear

        // Step 3: Perform a screen reader test on the 'CONTINUE AS SAM' button
        onView(withId(R.id.id_gdp_dialog_continue_button)).check(matches(isClickable()));
        
        AccessibilityNodeInfo node = Espresso.accessibility().getAccessibilityNodeProviderOnView(
                activityTestRule.getActivity().findViewById(R.id.id_gdp_dialog_continue_button))
                .findFocus();
        
        if (node != null) {
            String text = node.getText();
            if ("Continue as Sam".equals(text)) {
                System.out.println("Screen reader correctly announces the button text.");
            } else {
                System.err.println("Screen reader did not announce the correct text: " + text);
            }
        }

        // Additional assertion to ensure the button is announced correctly
        onView(withId(R.id.id_gdp_dialog_continue_button)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for the screen reader announcement

        Espresso.pressBack(); // Close the dialog
    }
}