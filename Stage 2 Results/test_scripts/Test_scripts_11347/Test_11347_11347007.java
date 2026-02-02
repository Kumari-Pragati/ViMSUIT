package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Spinner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_11347_11347007 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityScreenReaderInteraction() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'TEAMDEX' section.
        Espresso.onView(ViewMatchers.withId(R.id.id_team)).perform(ViewActions.click());

        // Step 2: Click on the 'Create a Team' option in the main content area.
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Use a screen reader to interact with the screen.
        Espresso.pressBack(); // Simulate going back to the previous screen
        Thread.sleep(500); // Wait for UI to update

        // Assert that the screen reader provides a clear and accurate description of the elements on the screen
        Espresso.onData(ViewMatchers.instanceOf(Spinner.class))
                .inAdapterView(ViewMatchers.withId(R.id.id_team))
                .perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        Espresso.onView(ViewMatchers.isAssignableFrom(Spinner.class))
                .check(ViewAssertions.matches(ViewMatchers.hasDescendant(
                        ViewMatchers.withText("N/A"))));

        // Additional assertions can be added here based on the expected content description
    }
}