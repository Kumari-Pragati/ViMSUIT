package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Switch;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class Test_10304_10304004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyNameSubmission() throws InterruptedException {
        // Navigate to the contact form screen (assuming it's already on this screen)
        
        // Click on the 'Nombre' field and enter ' '
        onView(withId(R.id.sender_name)).perform(ViewActions.clearText());
        Thread.sleep(500);

        // Toggle the 'Envía' switch to 'Enviar'
        Switch sendSwitch = activityTestRule.getActivity().findViewById(R.id.send_switch);
        sendSwitch.setChecked(true);
        Thread.sleep(500);

        // Click the 'Enviar' button to submit the form
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Assert that an error message is displayed
        Espresso.onView(ViewMatchers.withText("Please enter a valid name"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(Switch.class)))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}