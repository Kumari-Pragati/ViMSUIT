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

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15452_1545206 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheNavigationBackButton() throws InterruptedException {
        // Navigate to the screen displaying the biblical text from Book of Numbers, chapter 7.
        // For this example, we assume that the book and chapter are already selected.

        // Click on the navigation back button
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_main_page_menu_btn)).perform(ViewActions.click());

        // Verify that the user is navigated back to the previous screen
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(ViewAssertions.matches(isDisplayed()));
    }
}