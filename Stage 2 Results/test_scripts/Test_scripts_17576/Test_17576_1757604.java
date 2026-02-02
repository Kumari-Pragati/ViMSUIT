package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.is;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_17576_1757604 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheOkButton() throws InterruptedException {
        // Navigate to the 'Help/Info' page (assuming it's the main activity)
        Espresso.onView(withId(R.id.help_info_page)).check(ViewAssertions.matches(isDisplayed()));

        Thread.sleep(500); // Wait for 500ms

        // Click on the 'OK' button
        Espresso.onView(withContentDescription("[None]")).perform(click());

        Thread.sleep(500); // Wait for 500ms

        // Assert that the 'Help/Info' page is still displayed
        Espresso.onView(withId(R.id.help_info_page)).check(ViewAssertions.matches(isDisplayed()));
    }
}