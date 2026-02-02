package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_15001_15001004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheChevronIconFunctionality() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'France: Ligue 1' section.
        Espresso.onView(ViewMatchers.withText("France: Ligue 1")).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click on the chevron icon next to a match
        onView(withId(R.id.id_modification_liste_match)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Verify that the detailed view of the match is displayed
        Espresso.onView(isDisplayed()).inRoot(isDialog()).check(ViewAssertions.matches(isDisplayed()));

        Thread.sleep(500); // Wait for UI to update
    }
}