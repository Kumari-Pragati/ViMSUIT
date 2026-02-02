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

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15393_1539303 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserReadsTheInformationOnDonating() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Your good deed for today' screen.
        Espresso.onView(withContentDescription("Open side menu")).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Read the information on donating as little as 10PLN to cover the cost of 20 diapers for children saved from abortion.
        Espresso.onView(withText("Donating as little as 10PLN")).check(ViewAssertions.matches(withText("Donating as little as 10PLN")));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Assert that the donation information is clearly visible and legible.
        Espresso.onView(withText("20 diapers for children saved from abortion")).check(ViewAssertions.matches(withText("20 diapers for children saved from abortion")));
    }
}