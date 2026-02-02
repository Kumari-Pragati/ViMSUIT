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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_18262_18262001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationToHomeScreenFromDeviceScreen() throws InterruptedException {
        // Click on the back arrow in the header to navigate to the Home screen.
        Thread.sleep(500);
        onView(withContentDescription("Close navigation drawer")).perform(click());
        
        // Wait for 500ms
        Thread.sleep(500);

        // Assert that the Home screen is displayed
        Espresso.onView(withId(R.id.home_screen)).check(ViewAssertions.matches(isDisplayed()));
    }
}