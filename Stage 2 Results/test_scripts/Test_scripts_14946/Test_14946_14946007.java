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
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(JUnit4.class)
public class Test_14946_14946007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForADressUsingTheSearchIcon() throws InterruptedException {
        // Step 1: Click on the search icon
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Step 2: Enter a dress name in the search bar
        onView(withId(R.id.search_edit_text)).perform(typeText("Dress"), closeSoftKeyboard());
        Thread.sleep(500);

        // Step 3: Press enter
        Espresso.pressKey(ViewActions.keyEvent(KeyEvent.KEYCODE_ENTER));
        Thread.sleep(500);

        // Expected Result: The search results for the entered dress name are displayed
        onView(withId(R.id.search_results)).check(matches(isDisplayed()));
    }
}