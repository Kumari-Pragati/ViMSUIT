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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_10304_10304006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyMessageSubmission() throws InterruptedException {
        // Navigate to the contact form screen (assuming it's already on this screen)
        
        // Click on the 'Mensaje' field and enter ' '
        onView(withId(R.id.sender_message)).perform(ViewActions.typeText(" "), ViewActions.clearText());
        
        Thread.sleep(500); // Wait for UI updates
        
        // Toggle the 'Envía' switch to 'Enviar'
        Switch sendSwitch = activityRule.getActivity().findViewById(R.id.send_switch);
        sendSwitch.setChecked(true);
        
        Thread.sleep(500); // Wait for UI updates
        
        // Click the 'Enviar' button to submit the form
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for UI updates
        
        // Assert that an error message is displayed
        onView(withId(R.id.error_message)).check(matches(isDisplayed()));
    }
}