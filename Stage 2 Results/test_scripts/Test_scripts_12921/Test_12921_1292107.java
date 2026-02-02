package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_12921_1292107 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchBarWithInvalidInput() throws InterruptedException {
        // Step 1: Click on the search bar.
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Type 'invalid input' into the search bar.
        onView(withId(R.id.mt_trips_search_view)).perform(ViewActions.typeText("invalid input"));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Press enter to execute the search.
        Espresso.closeSoftKeyboard();
        Espresso.pressKey(KeyEvent.KEYCODE_ENTER);
        
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The screen should display an error message indicating invalid input.
        onView(withId(R.id.error_message)).check(matches(isDisplayed()));
    }
}