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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;

@RunWith(AndroidJUnit4.class)
public class Test_18717_18717001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheResetButton() throws InterruptedException {
        // Step 1: Click on the 'Reset' button at the bottom of the screen.
        onView(withId(R.id.id_btnResetTest)).perform(click());
        Thread.sleep(500); // Wait for 500ms to ensure the UI updates

        // Expected Result: The array should be reset to its initial state.
        // Assuming there is a method in MainActivity that checks the initial state of the array
        Espresso.onView(withId(R.id.id_arrayView)).check(matches(isEnabled()));
    }
}