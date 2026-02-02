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
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_124_124003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryvalidationMaximumWaistMeasurement() throws InterruptedException {
        // Open the app and navigate to the Waist to Height Ratio screen.
        Espresso.onView(ViewMatchers.withContentDescription("Navigate up")).perform(ViewActions.click());
        Thread.sleep(500);

        // Test Element 1: Select Female Gender
        onView(withId(R.id.id_gender_woman_button)).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Female")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Test Element 2: Select Metric System
        onView(withId(R.id.id_measureSystemButton_metric)).perform(click());
        Thread.sleep(500);

        // Test Element 3: Enter Height as 6 feet (183 cm)
        Espresso.onView(ViewMatchers.withId(R.id.id_height_input)).perform(ViewActions.typeText("183"));
        Thread.sleep(500);

        // Test Element 4: Enter Waist Measurement as 100 cm
        Espresso.onView(ViewMatchers.withId(R.id.id_waist_input)).perform(ViewActions.typeText("100"));
        Thread.sleep(500);

        // Test Element 5: Click on the 'WAIST TO HEIGHT RATIO' button
        Espresso.onView(ViewMatchers.withId(R.id.id_calculate_button)).perform(click());
        Thread.sleep(500);

        // Verify that the fields are populated with calculated values
        Espresso.onView(ViewMatchers.withId(R.id.id_waist_to_height_ratio_result))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.id_ideal_waist_result))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

    }
}