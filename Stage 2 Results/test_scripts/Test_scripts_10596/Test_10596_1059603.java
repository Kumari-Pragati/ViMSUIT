package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.SearchView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_10596_1059603 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForASpecificHelpTopic() throws InterruptedException {
        // Step 1: Open the app and navigate to the Help screen.
        Thread.sleep(500); // Wait for the app to initialize

        // Step 2: Tap the search icon in the header.
        onView(withId(R.id.id_hs__search)).perform(click());
        Thread.sleep(500);

        // Step 3: Enter a search term (e.g., 'Caller ID') and tap the search button.
        onView(withText("Search")).inRoot(isDialog()).perform(ViewActions.typeText("Caller ID"), ViewActions.closeSoftKeyboard());
        Espresso.pressBack(); // Press back to dismiss the keyboard
        Thread.sleep(500);
        onView(withId(R.id.id_hs__search)).perform(click());
        Thread.sleep(500);

        // Step 4: Verify that the search results display the relevant help topic.
        onView(withText("Caller ID")).check(matches(isDisplayed()));
    }
}