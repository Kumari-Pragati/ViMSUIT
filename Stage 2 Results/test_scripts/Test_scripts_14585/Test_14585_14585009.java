package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14585_14585009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheAboutUsOption() throws InterruptedException {
        // Step 1: Open the application (Assumed to be opened by default)
        
        // Step 2: Navigate to the 'Data Sharing' menu
        onView(withContentDescription("Data Sharing")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Select the 'About us' option
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The application should navigate to the 'About us' screen
        Espresso.onView(withId(R.id.about_us_screen)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}