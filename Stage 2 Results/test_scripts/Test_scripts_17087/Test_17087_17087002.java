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
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_17087_17087002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSearchWithAnInvalidZipCode() throws InterruptedException {
        // Step 1: Enter '12345' in the input field
        onView(withId(R.id.id_zipCodeInput)).perform(clearText(), ViewActions.typeText("12345"));

        // Step 2: Tap the search icon in the header/app bar
        Thread.sleep(500);
        onView(withId(R.id.id_imgBtnSearch)).perform(click());

        // Wait for a moment to ensure the error message is displayed
        Thread.sleep(500);

        // Expected Result: The app should display an error message indicating the zip code is invalid
        onView(withText("Invalid Zip Code")).inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.FrameLayout.class)))
                .check(matches(isDisplayed()));
    }
}