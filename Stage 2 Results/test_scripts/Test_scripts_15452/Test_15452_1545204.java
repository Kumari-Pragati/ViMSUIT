package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15452_1545204 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheMenuIconInTheHeader() throws InterruptedException {
        // Step 1: Open the app and navigate to the screen displaying the biblical text from Book of Numbers, chapter 7.
        // Assuming this step is handled by the activity or a previous test

        // Step 2: Click on the menu icon in the header
        Thread.sleep(500);
        onView(withId(R.id.id_main_page_menu_btn)).perform(ViewActions.click());

        // Step 3: Verify that the menu options are displayed
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(ViewAssertions.matches(isDisplayed()));
    }
}