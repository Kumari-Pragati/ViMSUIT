package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_13696_13696003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidTimeSelection() throws InterruptedException {
        // Step 1: Open the app and navigate to the mood logging screen.
        onView(withId(R.id.id_module_tracking_edit_time)).perform(click());

        // Step 2: Enter a mood level using the slider. (Assuming there's a slider with id R.id.mood_slider)
        // For simplicity, we'll just click on it
        onView(withId(R.id.mood_slider)).perform(ViewActions.click());

        // Step 3: Select an invalid time using the time picker.
        Thread.sleep(500); // Wait for the time picker to open

        // Simulate selecting an invalid time (e.g., 24:60)
        onView(withId(R.id.id_module_tracking_edit_time)).perform(ViewActions.click());
        Espresso.closeSoftKeyboard();
        Thread.sleep(500);

        // Step 4: Tap the checkmark (√) button.
        Button checkmarkButton = activityRule.getActivity().findViewById(R.id.checkmark_button);
        checkmarkButton.perform(click());

        // Expected Result: The app should display an error message indicating an invalid time selection.
        Thread.sleep(500); // Wait for the error to be displayed
        onView(withText("Invalid time selected")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}