package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_13696_13696005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyDateSelection() throws InterruptedException {
        // Step 1: Open the app and navigate to the mood logging screen.
        Espresso.onView(withId(R.id.moodLoggingScreen)).perform(click());

        // Step 2: Enter a mood level using the slider.
        Espresso.onView(withId(R.id.moodSlider)).perform(ViewActions.scrollTo(), ViewActions.click());

        // Step 3: Select a time using the time picker.
        Espresso.onView(withId(R.id.timePicker)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for the time picker to open

        // Step 4: Tap the checkmark (✓) button without selecting a date.
        Espresso.onView(withId(R.id.id_module_tracking_edit_date)).perform(click());
        Thread.sleep(500); // Wait for the date picker to open
        Espresso.pressBack(); // Close the date picker
        Espresso.onView(withId(R.id.checkMarkButton)).perform(click());

        // Expected Result: The app should display an error message indicating that a date is required.
        onView(withText("Please select a date")).inRoot(isDialog()).check(matches(ViewMatchers.isDisplayed()));
    }
}