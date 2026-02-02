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
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_10180_1018005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckIfTheAppCanHandleInvalidSearchTerms() throws InterruptedException {
        // Step 1: Click on the search icon in the header
        onView(withId(R.id.id_menu_search)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Enter '12345' in the search bar
        onView(withId(R.id.search_query)).perform(ViewActions.typeText("12345"));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Press enter to perform the search
        Espresso.closeSoftKeyboard();
        Espresso.pressImeActionButton();
        
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The app should display a message indicating an invalid search term
        onView(withText("Invalid search term")).inRoot(withDecorView(not(activityRule.getActivity().getWindow().getDecorView()))).check(matches(isDisplayed()));
    }
}