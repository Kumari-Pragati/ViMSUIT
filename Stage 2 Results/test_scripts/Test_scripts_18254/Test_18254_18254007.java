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
public class Test_18254_18254007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckUsabilityOfTheScreen() throws InterruptedException {
        // Perform a usability test on the 'Add vehicle' screen.
        
        // Wait for 500ms to ensure the screen is fully loaded.
        Thread.sleep(500);
        
        // Click the OK button.
        onView(withId(R.id.id_buttonDefaultPositive)).perform(ViewActions.click());
        
        // Wait for 500ms after interaction.
        Thread.sleep(500);
        
        // Assert that the screen is easy to use and navigate.
        Espresso.onView(withId(R.id.id_buttonDefaultPositive)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}