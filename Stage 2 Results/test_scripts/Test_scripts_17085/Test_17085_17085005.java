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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_17085_17085005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchFunctionalityWithNumericInput() throws InterruptedException {
        // Step 1: Click on the search bar labeled 'Area or Zipcode'.
        onView(withId(R.id.id_search)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Type '10001' into the search bar.
        onView(withId(R.id.id_search)).perform(ViewActions.typeText("10001"));

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Press the enter key to perform the search.
        Espresso.pressKey(getInstrumentation().getTargetContext().getResources().getResourceEntryName(R.string.enter_key));

        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should display a list of restaurants in the ZIP code 10001 based on the user's input.
        onView(withId(R.id.restaurant_list)).check(ViewAssertions.matches(isDisplayed()));
    }
}