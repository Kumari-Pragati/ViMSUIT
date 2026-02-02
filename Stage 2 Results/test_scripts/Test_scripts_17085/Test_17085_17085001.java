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
public class Test_17085_17085001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchFunctionalityWithValidInput() throws InterruptedException {
        // Step 1: Click on the search bar labeled 'Area or Zipcode'.
        onView(withId(R.id.id_search)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Type 'New York' into the search bar.
        onView(withId(R.id.id_search)).perform(ViewActions.typeText("New York"));

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Press the enter key to perform the search.
        Espresso.pressKey(getInstrumentation().getTargetContext().getResources().getResourceEntryName(android.support.test.espresso.action.ViewActions.Keys.ENTER));

        Thread.sleep(500); // Wait for UI to update

        // EXPECTED RESULT: The app should display a list of restaurants in New York based on the user's input.
        onView(withText("New York")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}