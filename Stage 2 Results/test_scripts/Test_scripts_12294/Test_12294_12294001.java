package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(JUnit4.class)
public class Test_12294_12294001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigatingThroughCallLogs() throws InterruptedException {
        // Element 1: withId(R.id.id_pager)
        onView(withId(R.id.id_pager))
                .perform(click());
        Thread.sleep(500);
        
        // Verify that the 'TODAY' and 'YESTERDAY' sections are displayed correctly
        verifySectionsDisplayed();
        
        // Select a call log entry from the 'TODAY' section (assuming there is at least one)
        List<TextView> todayEntries = Espresso.onData(ViewMatchers.withId(R.id.call_log_entry))
                .inAdapterView(withId(R.id.id_pager))
                .onChildView(withText("TODAY"))
                .perform(click());
        
        Thread.sleep(500);
        
        // Verify that the detailed call log information is displayed
        verifyDetailedCallLogInfoDisplayed();
        
        // Navigate back to the main call logs screen
        Espresso.pressBack();
        Thread.sleep(500);

        // Element 2: withId(R.id.id_skipButton)
        onView(withId(R.id.id_skipButton))
                .perform(click());
        Thread.sleep(500);
        
        // Verify that navigating back works as expected (assuming the skip button returns to main screen)
        verifyMainCallLogsScreenDisplayed();
    }

    private void verifySectionsDisplayed() {
        onView(allOf(withText("TODAY"), isDisplayed()))
                .check(matches(isDisplayed()));
        onView(allOf(withText("YESTERDAY"), isDisplayed()))
                .check(matches(isDisplayed()));
    }

    private void verifyDetailedCallLogInfoDisplayed() {
        // Assuming the detailed call log information includes these elements
        onView(withId(R.id.caller_name))
                .check(matches(isDisplayed()));
        onView(withId(R.id.caller_number))
                .check(matches(isDisplayed()));
        onView(withId(R.id.location))
                .check(matches(isDisplayed()));
        onView(withId(R.id.time))
                .check(matches(isDisplayed()));
        onView(withId(R.id.carrier))
                .check(matches(isDisplayed()));
    }

    private void verifyMainCallLogsScreenDisplayed() {
        // Verify that the main call logs screen is displayed
        onView(allOf(withText("TODAY"), isDisplayed()))
                .check(matches(isDisplayed()));
        onView(allOf(withText("YESTERDAY"), isDisplayed()))
                .check(matches(isDisplayed()));
    }
}