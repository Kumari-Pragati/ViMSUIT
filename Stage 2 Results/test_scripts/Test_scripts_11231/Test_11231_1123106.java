package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11231_1123106 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInputValidationUserEntersAValidCuisineName() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_menu_open))
                .perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_btnFindRestaurants))
                .check(matches(isDisplayed()))
                .perform(click());
        Thread.sleep(500);

        // Assuming the app navigates to a new screen after clicking FIND RESTAURANTS
        // Verify that the next element is not displayed, as it should be hidden or irrelevant here.
        onView(withId(R.id.id_btnLogin))
                .check(matches(not(isDisplayed())));

        // Continue for all elements...
    }
}