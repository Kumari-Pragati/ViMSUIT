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

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17085_17085008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchFunctionalityWithInvalidInput() throws InterruptedException {
        // Step 1: Click on the search bar labeled 'Area or Zipcode'.
        onView(withId(R.id.id_search)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Type an empty string into the search bar.
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.id_search)).perform(ViewActions.typeText(""));

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Press the enter key to perform the search.
        Espresso.pressKey(KeyEvent.KEYCODE_ENTER);

        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should display an error message indicating that a valid input is required.
        onView(withText(R.string.error_invalid_input)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}