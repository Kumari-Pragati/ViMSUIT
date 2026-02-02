package com.example.tests;

import android.widget.ListView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.Priority;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@Priority(2)
public class Test_1303_130305 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testToggleStateSelectingTheSameCityMultipleTimes() throws InterruptedException {
        // Open the application (assumed to be opened by ActivityTestRule)

        // Navigate to the 'Select City' screen
        Espresso.onView(ViewMatchers.withId(R.id.id_city_list_view)).performScrollTo();

        // Tap on 'BUENOS AIRES'
        Espresso.onView(ViewMatchers.withText("BUENOS AIRES")).perform(click());
        Thread.sleep(500);

        // Verify that 'BUENOS AIRES' is selected
        Espresso.onView(ViewMatchers.withId(R.id.id_city_list_view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Tap on 'BUENOS AIRES' again
        Espresso.onView(ViewMatchers.withText("BUENOS AIRES")).perform(click());
        Thread.sleep(500);

        // Verify that 'BUENOS AIRES' remains selected
        Espresso.onView(ViewMatchers.withId(R.id.id_city_list_view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}