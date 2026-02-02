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
public class Test_10180_1018004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckIfTheAppCanHandleEmptySearchResults() throws InterruptedException {
        // Step 1: Click on the search icon in the header
        onView(withId(R.id.id_menu_search)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Enter 'Nonexistent Movie' in the search bar
        Espresso.onView(ViewMatchers.withText("Nonexistent Movie")).inRoot(
                org.hamcrest.core.Is.is(org.espresso.contrib.RootMatchers.withDecorView(org.hamcrest.core.IsNot.not(activityRule.getActivity().getWindow().getDecorView()))))
                .perform(ViewActions.typeText("Nonexistent Movie"));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Press enter to perform the search
        Espresso.pressKey(KeyEvent.KEYCODE_ENTER);
        
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The app should display a message indicating no results found
        onView(ViewMatchers.withText("No results found")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}