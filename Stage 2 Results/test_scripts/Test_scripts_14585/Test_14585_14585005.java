package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_14585_14585005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheShareAppOption() throws InterruptedException {
        // Step 1: Open the application (Assumed to be opened by ActivityTestRule)
        
        // Step 2: Navigate to the 'Data Sharing' menu
        onView(withContentDescription("Data Sharing")).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Select the 'Share app' option
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The application should navigate to the 'Share app' screen
        Espresso.onView(ViewMatchers.withId(R.id.share_app_screen)).check(matches(ViewMatchers.isDisplayed()));
    }
}