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
import static android.support.test.espresso.action.ViewActions.click;

@RunWith(AndroidJUnit4.class)
public class Test_15001_15001008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePencilIconFunctionality() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'France: Ligue 1' section.
        Espresso.onView(ViewMatchers.withText("France: Ligue 1")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Click on the pencil icon next to a match.
        Espresso.onView(withId(R.id.id_modification_liste_match)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Verify that the match details can be edited.
        Espresso.onView(ViewMatchers.withText("Edit Match Details")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}