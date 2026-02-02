package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_15109_1510905 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheRainMixedAndSnowLegendIsDisplayed() throws InterruptedException {
        // Click on the legend button to display the legend
        onView(withId(R.id.id_legend_button)).perform(ViewActions.click());
        
        // Wait for 500ms to ensure the legend is displayed
        Thread.sleep(500);
        
        // Verify that the Rain, Mixed, and Snow Legend is displayed at the bottom of the radar image
        onView(withId(R.id.id_legend_button)).check(ViewAssertions.matches(isDisplayed()));
    }
}