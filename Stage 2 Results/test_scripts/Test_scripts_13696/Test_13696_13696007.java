package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_13696_13696007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidDateFormat() throws InterruptedException {
        // Navigate to the mood logging screen and select a mood level using the slider.
        Espresso.onView(ViewMatchers.withId(R.id.id_module_tracking_edit_date))
                .perform(click());
        Thread.sleep(500);
        
        // Select an invalid date format
        Espresso.pressBack();
        Espresso.onView(ViewMatchers.withId(R.id.id_module_tracking_edit_time))
                .perform(click());
        Thread.sleep(500);

        // Verify the error message for the first element (date)
        Espresso.onView(ViewMatchers.withId(R.id.id_module_tracking_edit_date))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Navigate back to the date picker and select an invalid format
        Espresso.pressBack();
        Espresso.onView(ViewMatchers.withId(R.id.id_module_tracking_edit_date))
                .perform(click());
        Thread.sleep(500);

        // Verify the error message for the second element (time)
        Espresso.onView(ViewMatchers.withId(R.id.id_module_tracking_edit_time))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Tap the checkmark button
        Espresso.onView(ViewMatchers.withText("✓"))
                .perform(ViewActions.click());
    }
}