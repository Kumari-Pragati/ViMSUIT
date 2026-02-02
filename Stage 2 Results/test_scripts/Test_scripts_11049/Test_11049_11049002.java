package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11049_11049002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUnselectAllTvServicesAndConfirm() throws InterruptedException {
        // Loop through all 7 elements and perform test steps on each

        for (int i = 0; i < 7; i++) {
            onView(withId(R.id.id_item_softgate_radio)).perform(click());
            Thread.sleep(500);

            // Verify state
            onView(withId(R.id.id_item_softgate_radio)).check(matches(isNotChecked()));
        }

        // Click on the blue button 'TAK, TO MOJE KANAŁY'
        onView(withId(R.id.id_confirm_button)).perform(click());

        // Add assertions to verify each element's behavior after confirmation
        for (int i = 0; i < 7; i++) {
            onView(withId(R.id.id_item_softgate_radio)).check(matches(isNotChecked()));
        }
    }
}