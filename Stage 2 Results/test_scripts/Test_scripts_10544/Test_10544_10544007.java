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
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_10544_10544007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForNewCarsAccessibilityTest() throws InterruptedException {
        // Step 1: Open the CarWale app (Assuming it's already open and on the main screen)
        
        // Step 2: Tap on the 'New Car' tab
        onView(withText("New Cars")).perform(click());
        Thread.sleep(500);

        // Step 3: Enter 'New Cars' in the search input field
        onView(withId(R.id.search_input_field_id)).perform(typeText("New Cars"));
        Thread.sleep(500);

        // Step 4: Tap on the 'FIND CAR' button
        onView(withId(R.id.id_btnSearch1)).perform(click());
        Thread.sleep(500);

        // Expected Result: The screen should be accessible to users with visual impairments using screen readers.
        // Check if the FIND CAR button is still clickable and focusable after interaction
        AccessibilityNodeInfo node = Espresso.accessibility().getAccessibilityNodeProviderOnView(
                activityRule.getActivity().findViewById(R.id.id_btnSearch1)).getRoot();
        boolean isClickable = node.isClickable();
        boolean isFocusable = node.isFocusable();

        // Assert that the button remains interactive
        if (isClickable && isFocusable) {
            System.out.println("The 'FIND CAR' button is still accessible.");
        } else {
            throw new AssertionError("The 'FIND CAR' button is not accessible after interaction.");
        }
    }
}