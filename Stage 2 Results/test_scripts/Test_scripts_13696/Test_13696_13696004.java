package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatButton;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_13696_13696004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    private AppCompatButton checkmarkButton;

    @Before
    public void setUp() {
        // Initialize the checkmark button for later use
        checkmarkButton = activityRule.getActivity().findViewById(R.id.id_module_tracking_edit_time);
    }

    @Test
    public void testNegativeFlowEmptyMoodLevel throws InterruptedException {
        // Step 1: Open the app and navigate to the mood logging screen (Assuming it's already open)

        // Step 2: Select a date using the date picker
        onView(allOf(withId(R.id.datePicker), isDisplayed())).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Select a time using the time picker
        onView(allOf(withId(R.id.timePicker), isDisplayed())).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 4: Tap the checkmark (✓) button without entering a mood level
        checkmarkButton.perform(click());
        Thread.sleep(500);

        // Expected Result: The app should display an error message indicating that a mood level is required
        onView(allOf(withId(R.id.error_message), isDisplayed())).check(matches(isDisplayed()));
    }
}