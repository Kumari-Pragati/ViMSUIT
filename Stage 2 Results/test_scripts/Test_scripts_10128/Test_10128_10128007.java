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

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_10128_10128007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySearchFunctionality() throws InterruptedException {
        // Open the Help section (assuming it's opened by default or through some other method)
        
        // Click on the search icon in the header
        onView(withId(R.id.id_uv_action_search)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Enter the search term 'locations' in the search bar
        onView(withText("Search")).inRoot(isDialog()).perform(ViewActions.typeText("locations"));
        Thread.sleep(500); // Wait for keyboard to appear and user input
        
        // Press enter to perform the search
        Espresso.pressKey(getInstrumentation().getTargetContext().getResources().getResourceEntryName(R.id.enter_key));
        Thread.sleep(500); // Wait for search results to load
        
        // Verify that search results for 'locations' are displayed
        onView(withText("locations")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}