package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_17085_17085006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchFunctionalityWithInvalidNumericInput() throws InterruptedException {
        // Step 1: Click on the search bar labeled 'Area or Zipcode'.
        onView(withId(R.id.id_search)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Type '10001a' into the search bar.
        onView(withId(R.id.id_search)).perform(ViewActions.typeText("10001a"));

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Press the enter key to perform the search.
        Espresso.pressKey(KeyEvent.KEYCODE_ENTER);

        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should display an error message indicating that a valid ZIP code is required.
        onView(ViewMatchers.withText("Please enter a valid ZIP code")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}