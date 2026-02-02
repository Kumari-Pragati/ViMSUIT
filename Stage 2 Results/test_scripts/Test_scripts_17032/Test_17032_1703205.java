package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_17032_1703205 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testUserCanSetADestinationUsingTheSetButton() throws InterruptedException {
        // Step 1: Click on the 'SET' button on the header.
        onView(allOf(withId(R.id.id_footer_add_button))).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for 500 milliseconds to ensure the UI updates
        
        // Expected result: The screen should prompt the user to set a destination for navigation
        onView(withText("Set Destination")).inRoot(org.hamcrest.core.AllOf.allOf(
                org.espresso.contrib.RootMatchers.withDecorView(not(activityRule.getActivity().getWindow().getDecorView()))))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}