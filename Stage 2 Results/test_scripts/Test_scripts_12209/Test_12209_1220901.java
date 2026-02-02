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
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_12209_1220901 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndNavigateToTheFansSection() throws InterruptedException {
        // Step 1: Open the app (already done by ActivityTestRule)

        // Step 2: Click on the hamburger menu icon in the header
        Thread.sleep(500);
        onView(allOf(withId(R.id.Main_Menu_Closed), withContentDescription("['Main Menu Closed']"))).perform(click());

        // Step 3: Navigate to the 'FANS' section
        Thread.sleep(500);

        // Expected Result: The 'FANS' section is displayed
        Espresso.onView(withId(R.id.fans_section)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}