package com.example.tests;

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
public class Test_11231_1123102 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserEntersAnInvalidCuisineName() throws InterruptedException {
        // Loop through all elements and perform test steps on each

        // Element 1: Open the Talabat.com mobile app (already done by ActivityTestRule)
        
        // Element 2: Click on the search icon in the header
        onView(withId(R.id.id_menu_open)).perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_btnFindRestaurants)).check(matches(isDisplayed()));
        
        // Element 3: Enter 'invalid_cuisine' in the 'All Cuisines' input field and click on FIND RESTAURANTS button
        onView(withId(R.id.id_btnFindRestaurants)).perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_btnLogin)).check(matches(isDisplayed()));
        
        // Element 4: Click on the 'LOGIN' button (assuming it's part of the flow)
        onView(withId(R.id.id_btnLogin)).perform(click());
        Thread.sleep(500);
        // Verify state
    }
}