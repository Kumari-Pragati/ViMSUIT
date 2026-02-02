package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_11049_11049007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSelectSomeTvServicesAndTryToUnselectAll() throws InterruptedException {
        // Loop through all 7 elements and perform test steps on each

        for (int i = 0; i < 7; i++) {
            onView(withId(R.id.id_item_softgate_radio)).perform(click());
            Thread.sleep(500);

            Espresso.closeSoftKeyboard();
            Espresso.pressBack();

            // Unselect all checkboxes next to the TV service providers
            for (int j = 0; j < 7; j++) {
                onView(withId(R.id.id_item_softgate_radio)).perform(ViewActions.click());
                Thread.sleep(500);
            }

            // Click on the blue button 'TAK, TO MOJE KANAŁY'
            Espresso.onView(hasDescendant(withText("TAK, TO MOJE KANAŁY"))).perform(click());

            // Verify error message is displayed
            Espresso.onView(hasErrorText("All TV services must be selected"))
                    .check(ViewAssertions.matches(isDisplayed()));
        }
    }

    private String hasErrorText(String text) {
        return withText(text);
    }
}