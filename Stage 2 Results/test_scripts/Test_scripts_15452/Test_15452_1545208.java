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
public class Test_15452_1545208 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheNavigationHomeButton() throws InterruptedException {
        // Step 1: Open the app and navigate to the screen displaying the biblical text from Book of Numbers, chapter 7.
        // Assuming this step is already handled by the ActivityTestRule

        // Step 2: Click on the navigation home button
        Thread.sleep(500);
        onView(withId(R.id.id_main_page_menu_btn)).perform(ViewActions.click());

        // Step 3: Verify that the user is navigated to the home screen
        Thread.sleep(500);
        Espresso.onView(hasDesc("Home Screen Title or Description")).check(matches(isDisplayed()));
    }
}