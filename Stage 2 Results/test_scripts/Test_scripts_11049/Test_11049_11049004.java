package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.RadioButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11049_11049004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUnselectAllTvServicesAndTryToConfirm() throws InterruptedException {
        // Unselect all checkboxes and verify the error message

        for (int i = 0; i < 7; i++) {
            onView(withId(R.id.id_item_softgate_radio)).perform(click());
            Thread.sleep(500);
            RadioButton radioButton = activityRule.getActivity().findViewById(R.id.id_item_softgate_radio);
            if (radioButton.isChecked()) {
                throw new AssertionError("RadioButton should be unchecked");
            }
        }

        // Click on the blue button 'TAK, TO MOJE KANAŁY'
        onView(withId(R.id.id_confirm_button)).perform(click());
        Thread.sleep(500);

        // Verify error message
        onView(withText("All TV services must be selected")).check(matches(isDisplayed()));
    }
}