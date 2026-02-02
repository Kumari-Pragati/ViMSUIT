package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_11746_11746010 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestHeaderNavigation() throws InterruptedException {
        // Ensure the Vocabulary screen is open.
        Espresso.onView(allOf(withContentDescription("Navigate up"))).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for 500ms to ensure navigation completes

        // Verify that we are back on the previous screen
        Espresso.onView(allOf(withContentDescription("Navigate up"))).check(matches(not(isDisplayed())));
    }
}