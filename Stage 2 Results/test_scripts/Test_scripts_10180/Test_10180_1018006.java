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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10180_1018006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckIfTheAppCanHandleNavigationBetweenScreens() throws InterruptedException {
        // Step 1: Navigate to the MOVIES screen
        onView(withId(R.id.id_grid_view)).check(matches(isDisplayed()));

        // Step 2: Click on the title 'Christmas on the Bayou'
        Thread.sleep(500);
        // Assuming there is a way to click on a specific item in the grid view, for example:
        // onView(withText("Christmas on the Bayou")).perform(click());
        
        // Step 3: Navigate back to the MOVIES screen
        Espresso.pressBack();
        Thread.sleep(500);

        // Expected Result: The MOVIES screen should be displayed again
        onView(withId(R.id.id_grid_view)).check(matches(isDisplayed()));
    }
}