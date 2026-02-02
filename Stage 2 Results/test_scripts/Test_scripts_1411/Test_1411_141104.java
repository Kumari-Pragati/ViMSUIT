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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_1411_141104 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testContentListInteraction() throws InterruptedException {
        // Step 1: Open the mobile app and navigate to the 'Browse' page.
        onView(withId(R.id.browse_button)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Select a TV show from the content list.
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Verify that the selected TV show's details are displayed.
        TextView titleTextView = (TextView) activityTestRule.getActivity().findViewById(R.id.tv_show_title);
        onView(withId(titleTextView.getId())).check(matches(withText("Expected Show Title")));
        
        Thread.sleep(500); // Wait for UI to update
        
        Espresso.pressBack(); // Go back to the previous screen
    }
}