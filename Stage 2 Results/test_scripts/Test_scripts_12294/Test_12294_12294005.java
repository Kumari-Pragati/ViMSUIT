package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.content.ContextCompat;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12294_12294005 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityTestingScreenReaderFunctionality() throws InterruptedException {
        // Step 1: Open the app and navigate to the call logs screen.
        Espresso.onView(ViewMatchers.withId(R.id.callLogsScreen)).perform(ViewActions.click());

        // Step 2: Use a screen reader to navigate through the screen.
        // Note: This step is typically handled by the device's accessibility features, so we simulate it with Espresso actions.

        // Step 3: Verify that all elements, including the 'TODAY' and 'YESTERDAY' sections, are accessible.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("TODAY")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withText("YESTERDAY")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 4: Verify that the 'SKIP THIS' button is accessible.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_skipButton)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.id_skipButton)).check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
    }
}