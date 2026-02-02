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
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_17087_17087003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationSearchWithAValidZipCode() throws InterruptedException {
        // Step 1: Enter '94010' in the input field
        onView(withId(R.id.id_zipCodeInput)).perform(typeText("94010"), ViewActions.closeSoftKeyboard());

        // Step 2: Tap the search icon in the header/app bar
        Thread.sleep(500);
        onView(withId(R.id.id_imgBtnSearch)).perform(ViewActions.click());

        // Wait for a moment to ensure the list is loaded
        Thread.sleep(1000);

        // Expected result: The app should display a list of restaurants in the 94010 area
        onView(withText("Restaurants in 94010")).check(matches(ViewMatchers.isDisplayed()));
    }
}