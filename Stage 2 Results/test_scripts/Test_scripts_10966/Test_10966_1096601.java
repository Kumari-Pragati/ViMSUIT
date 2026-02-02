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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10966_1096601 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTheAboutPageHeader() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'About' page.
        onView(withContentDescription("Navigate up")).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Step 2: Verify that the header contains a back arrow and the word 'About'.
        onView(withContentDescription("Navigate up")).check(matches(ViewMatchers.isDisplayed()));
        onView(withText("About")).check(matches(ViewMatchers.isDisplayed()));

        // Additional assertion to ensure both elements are present
        Espresso.onView(withContentDescription("Navigate up")).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Verify the 'About' page header text
        Espresso.onView(withText("About")).inRoot(isDialog()).check(matches(ViewMatchers.isDisplayed()));
    }
}