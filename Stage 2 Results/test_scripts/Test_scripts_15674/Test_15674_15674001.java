package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_15674_15674001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndVerifyTheHomePage() throws InterruptedException {
        // Open the shopping app (activity is already opened by ActivityTestRule)
        
        // Thread.sleep(500) to ensure UI is fully loaded before interacting with views
        Thread.sleep(500);
        
        // Verify that the header contains the menu icon, logo, and shopping bag icon
        onView(withId(R.id.id_toolbar_logo)).check(matches(isDisplayed()));
        
        // Add a delay between interactions
        Thread.sleep(500);
        
        // Assuming there are other icons in the toolbar with specific IDs
        // For example, R.id.menu_icon and R.id.shopping_bag_icon
        onView(withId(R.id.menu_icon)).check(matches(isDisplayed()));
        Thread.sleep(500);
        onView(withId(R.id.shopping_bag_icon)).check(matches(isDisplayed()));
    }
}