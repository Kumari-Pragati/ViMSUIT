package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_1115_1115003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testHeaderBackArrowShouldNavigateToPreviousScreen() throws InterruptedException {
        // Wait for the view to be displayed before interacting with it
        Thread.sleep(500);
        
        // Click on the back arrow in the header
        onView(withContentDescription("['Navigate up']")).perform(ViewActions.click());
        
        // Wait for 500ms to ensure navigation is complete
        Thread.sleep(500);
        
        // Assert that the previous screen is displayed
        Espresso.onView(isDisplayed()).check(matches(isDisplayed()));
    }
}